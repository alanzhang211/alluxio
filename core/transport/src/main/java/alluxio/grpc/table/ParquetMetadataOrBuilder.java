// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

public interface ParquetMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.table.ParquetMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .alluxio.grpc.table.FileMetadata file_metadata = 1;</code>
   */
  boolean hasFileMetadata();
  /**
   * <code>optional .alluxio.grpc.table.FileMetadata file_metadata = 1;</code>
   */
  alluxio.grpc.table.FileMetadata getFileMetadata();
  /**
   * <code>optional .alluxio.grpc.table.FileMetadata file_metadata = 1;</code>
   */
  alluxio.grpc.table.FileMetadataOrBuilder getFileMetadataOrBuilder();

  /**
   * <code>repeated .alluxio.grpc.table.BlockMetadata block_metadata = 2;</code>
   */
  java.util.List<alluxio.grpc.table.BlockMetadata> 
      getBlockMetadataList();
  /**
   * <code>repeated .alluxio.grpc.table.BlockMetadata block_metadata = 2;</code>
   */
  alluxio.grpc.table.BlockMetadata getBlockMetadata(int index);
  /**
   * <code>repeated .alluxio.grpc.table.BlockMetadata block_metadata = 2;</code>
   */
  int getBlockMetadataCount();
  /**
   * <code>repeated .alluxio.grpc.table.BlockMetadata block_metadata = 2;</code>
   */
  java.util.List<? extends alluxio.grpc.table.BlockMetadataOrBuilder> 
      getBlockMetadataOrBuilderList();
  /**
   * <code>repeated .alluxio.grpc.table.BlockMetadata block_metadata = 2;</code>
   */
  alluxio.grpc.table.BlockMetadataOrBuilder getBlockMetadataOrBuilder(
      int index);
}