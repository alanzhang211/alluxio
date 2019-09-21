/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.table.under.hive;

import alluxio.AlluxioURI;
import alluxio.client.file.FileSystem;
import alluxio.client.file.URIStatus;
import alluxio.conf.ServerConfiguration;
import alluxio.exception.AlluxioException;
import alluxio.grpc.FieldSchema;
import alluxio.grpc.FileStatistics;
import alluxio.grpc.HiveBucketProperty;
import alluxio.grpc.HiveTableInfo;
import alluxio.grpc.ParquetMetadata;
import alluxio.grpc.PartitionInfo;
import alluxio.grpc.Schema;
import alluxio.grpc.SortingColumn;
import alluxio.grpc.Storage;
import alluxio.grpc.StorageFormat;
import alluxio.grpc.UdbTableInfo;
import alluxio.table.common.TableView;
import alluxio.table.common.udb.UdbTable;
import alluxio.table.under.hive.parquet.AlluxioInputFile;
import alluxio.table.under.hive.util.PathTranslator;
import alluxio.util.ConfigurationUtils;

import org.apache.hadoop.hive.metastore.api.StorageDescriptor;
import org.apache.hadoop.hive.ql.metadata.Partition;
import org.apache.hadoop.hive.ql.metadata.Table;
import org.apache.parquet.hadoop.ParquetFileReader;
import org.apache.parquet.io.InputFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Hive table implementation.
 */
public class HiveTable implements UdbTable {
  private static final Logger LOG = LoggerFactory.getLogger(HiveTable.class);

  private final HiveDatabase mHiveDatabase;
  private final PathTranslator mPathTranslator;
  private final String mName;
  private final Schema mSchema;
  private final String mBaseLocation;
  private final Map<String, FileStatistics> mStatistics;
  private final List<PartitionInfo> mPartitionInfo;
  private final List<FieldSchema> mPartitionKeys;
  private final Table mTable;

  /**
   * Creates a new instance.
   *
   * @param hiveDatabase the hive db
   * @param pathTranslator the path translator
   * @param name the table name
   * @param schema the table schema
   * @param baseLocation the base location
   * @param statistics the table statistics
   * @param cols partition keys
   * @param partitions partition list
   * @param table hive table object
   */
  public HiveTable(HiveDatabase hiveDatabase, PathTranslator pathTranslator, String name,
      Schema schema, String baseLocation, Map<String, FileStatistics> statistics,
      List<FieldSchema> cols, List<Partition> partitions, Table table) throws IOException {
    // TODO(gpang): don't throw exception in constructor
    mHiveDatabase = hiveDatabase;
    mPathTranslator = pathTranslator;
    mName = name;
    mSchema = schema;
    mBaseLocation = baseLocation;
    mStatistics = statistics;
    mPartitionKeys = cols;
    mPartitionInfo = new ArrayList<>();
    for (Partition part : partitions) {
      PartitionInfo.Builder pib = PartitionInfo.newBuilder().setTableName(mName)
          .setSd(mPathTranslator.toAlluxioPath(part.getLocation().toString())).putAllFileMetadata(
              getPartitionMetadata(
                  mPathTranslator.toAlluxioPath(part.getPartitionPath().toString()),
                  mHiveDatabase.getUdbContext().getFileSystem()));
      if (part.getValues() != null) {
        pib.addAllValues(part.getValues());
      }
      mPartitionInfo.add(pib.build());
    }
    mTable = table;
  }

  // TODO(yuzhu): clean this up to use proper method to get a list of datafiles
  private static Map<String, ParquetMetadata> getPartitionMetadata(String path,
      FileSystem alluxioFs) {
    Map<String, ParquetMetadata> metadataMap = new HashMap<>();
    try {
      for (URIStatus status : alluxioFs.listStatus(new AlluxioURI(path))) {
        if (!status.isFolder() && !status.getName().endsWith(".crc")
            && !status.getName().equals("_SUCCESS")) {
          // it is a data file
          org.apache.parquet.hadoop.metadata.ParquetMetadata footer = null;
          try {
            InputFile in = AlluxioInputFile.create(alluxioFs, status);
            try (ParquetFileReader reader = ParquetFileReader.open(in)) {
              footer = reader.getFooter();
            }
          } catch (IOException | RuntimeException e) {
            LOG.warn("Unable to read parquet footer {}", status.getPath(), e);
          }
          if (footer != null) {
            String alluxioFilePath = status.getPath();
            if (alluxioFilePath.startsWith("/")) {
              // prefix with the scheme and authority
              alluxioFilePath = ConfigurationUtils.getSchemeAuthority(ServerConfiguration.global())
                  + alluxioFilePath;
            }
            metadataMap.put(alluxioFilePath, HiveUtils.toProto(footer));
          }
        }
      }
    } catch (IOException | AlluxioException e) {
      LOG.warn("Unable to read parquet footer from partition location {}", path, e);
    }
    return metadataMap;
  }

  @Override
  public String getName() {
    return mName;
  }

  @Override
  public Schema getSchema() {
    return mSchema;
  }

  @Override
  public TableView getView() {
    return new HiveTableView(mBaseLocation, mStatistics, mPartitionKeys, getPartitions());
  }

  @Override
  public String getBaseLocation() {
    return mBaseLocation;
  }

  @Override
  public Map<String, FileStatistics> getStatistics() {
    return mStatistics;
  }

  @Override
  public List<PartitionInfo> getPartitions() {
    return mPartitionInfo;
  }

  @Override
  public UdbTableInfo toProto() {
    HiveTableInfo.Builder builder = HiveTableInfo.newBuilder();
    builder.setDatabaseName(mTable.getDbName()).setTableName(mTable.getTableName())
        .setOwner(mTable.getOwner()).setTableType(mTable.getTableType().toString());

    StorageFormat format = StorageFormat.newBuilder()
        .setInputFormat(mTable.getSd().getInputFormat())
        .setOutputFormat(mTable.getSd().getOutputFormat())
        .setSerDe(mTable.getSd().getSerdeInfo().getName()).build(); // Check SerDe info
    Storage.Builder storageBuilder = Storage.newBuilder();

    StorageDescriptor sd = mTable.getSd();

    List<SortingColumn> sortingColumns = mTable.getSortCols().stream().map(
        order -> SortingColumn.newBuilder().setColumnName(order.getCol())
            .setOrder(order.getOrder() == 1 ? SortingColumn.SortingOrder.ASCENDING
                : SortingColumn.SortingOrder.DESCENDING).build())
        .collect(Collectors.toList());
    Storage storage = storageBuilder.setStorageFormat(format)
        .setLocation(mTable.getDataLocation().toString())
        .setBucketProperty(HiveBucketProperty.newBuilder().setBucketCount(mTable.getNumBuckets())
            .addAllBucketedBy(mTable.getBucketCols()).addAllSortedBy(sortingColumns).build())
        .setSkewed(sd.getSkewedInfo() != null && (sd.getSkewedInfo().getSkewedColNames()) != null
            && !sd.getSkewedInfo().getSkewedColNames().isEmpty())
        .putAllSerdeParameters(sd.getParameters()).build();
    builder.addAllDataColumns(HiveUtils.toProto(mTable.getCols()))
        .addAllPartitionColumns(HiveUtils.toProto(mTable.getPartCols()))
        .setStorage(storage).putAllParameters(mTable.getParameters())
        .setViewOriginalText(mTable.getViewOriginalText())
        .setViewExpandedText(mTable.getViewExpandedText());
    return UdbTableInfo.newBuilder().setHiveTableInfo(builder.build()).build();
  }
}
