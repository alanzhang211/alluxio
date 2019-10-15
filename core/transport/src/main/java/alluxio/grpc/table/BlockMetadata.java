// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

/**
 * Protobuf type {@code alluxio.grpc.table.BlockMetadata}
 */
public  final class BlockMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.table.BlockMetadata)
    BlockMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlockMetadata.newBuilder() to construct.
  private BlockMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlockMetadata() {
    rowCount_ = 0L;
    totalByteCount_ = 0L;
    path_ = "";
    colData_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlockMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            rowCount_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            totalByteCount_ = input.readInt64();
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            path_ = bs;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              colData_ = new java.util.ArrayList<alluxio.grpc.table.ColumnChunkMetaData>();
              mutable_bitField0_ |= 0x00000008;
            }
            colData_.add(
                input.readMessage(alluxio.grpc.table.ColumnChunkMetaData.PARSER, extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        colData_ = java.util.Collections.unmodifiableList(colData_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_BlockMetadata_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_BlockMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.table.BlockMetadata.class, alluxio.grpc.table.BlockMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int ROW_COUNT_FIELD_NUMBER = 1;
  private long rowCount_;
  /**
   * <code>optional int64 row_count = 1;</code>
   */
  public boolean hasRowCount() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int64 row_count = 1;</code>
   */
  public long getRowCount() {
    return rowCount_;
  }

  public static final int TOTAL_BYTE_COUNT_FIELD_NUMBER = 2;
  private long totalByteCount_;
  /**
   * <code>optional int64 total_byte_count = 2;</code>
   */
  public boolean hasTotalByteCount() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 total_byte_count = 2;</code>
   */
  public long getTotalByteCount() {
    return totalByteCount_;
  }

  public static final int PATH_FIELD_NUMBER = 3;
  private volatile java.lang.Object path_;
  /**
   * <code>optional string path = 3;</code>
   */
  public boolean hasPath() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string path = 3;</code>
   */
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        path_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string path = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COL_DATA_FIELD_NUMBER = 4;
  private java.util.List<alluxio.grpc.table.ColumnChunkMetaData> colData_;
  /**
   * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
   */
  public java.util.List<alluxio.grpc.table.ColumnChunkMetaData> getColDataList() {
    return colData_;
  }
  /**
   * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
   */
  public java.util.List<? extends alluxio.grpc.table.ColumnChunkMetaDataOrBuilder> 
      getColDataOrBuilderList() {
    return colData_;
  }
  /**
   * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
   */
  public int getColDataCount() {
    return colData_.size();
  }
  /**
   * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
   */
  public alluxio.grpc.table.ColumnChunkMetaData getColData(int index) {
    return colData_.get(index);
  }
  /**
   * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
   */
  public alluxio.grpc.table.ColumnChunkMetaDataOrBuilder getColDataOrBuilder(
      int index) {
    return colData_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt64(1, rowCount_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, totalByteCount_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, path_);
    }
    for (int i = 0; i < colData_.size(); i++) {
      output.writeMessage(4, colData_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, rowCount_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, totalByteCount_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, path_);
    }
    for (int i = 0; i < colData_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, colData_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof alluxio.grpc.table.BlockMetadata)) {
      return super.equals(obj);
    }
    alluxio.grpc.table.BlockMetadata other = (alluxio.grpc.table.BlockMetadata) obj;

    boolean result = true;
    result = result && (hasRowCount() == other.hasRowCount());
    if (hasRowCount()) {
      result = result && (getRowCount()
          == other.getRowCount());
    }
    result = result && (hasTotalByteCount() == other.hasTotalByteCount());
    if (hasTotalByteCount()) {
      result = result && (getTotalByteCount()
          == other.getTotalByteCount());
    }
    result = result && (hasPath() == other.hasPath());
    if (hasPath()) {
      result = result && getPath()
          .equals(other.getPath());
    }
    result = result && getColDataList()
        .equals(other.getColDataList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRowCount()) {
      hash = (37 * hash) + ROW_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRowCount());
    }
    if (hasTotalByteCount()) {
      hash = (37 * hash) + TOTAL_BYTE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTotalByteCount());
    }
    if (hasPath()) {
      hash = (37 * hash) + PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPath().hashCode();
    }
    if (getColDataCount() > 0) {
      hash = (37 * hash) + COL_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getColDataList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.table.BlockMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.BlockMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.BlockMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.BlockMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.BlockMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.BlockMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.BlockMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.BlockMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.BlockMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.BlockMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.BlockMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.BlockMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.table.BlockMetadata prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code alluxio.grpc.table.BlockMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.table.BlockMetadata)
      alluxio.grpc.table.BlockMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_BlockMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_BlockMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.table.BlockMetadata.class, alluxio.grpc.table.BlockMetadata.Builder.class);
    }

    // Construct using alluxio.grpc.table.BlockMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getColDataFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      rowCount_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      totalByteCount_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      path_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      if (colDataBuilder_ == null) {
        colData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        colDataBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_BlockMetadata_descriptor;
    }

    public alluxio.grpc.table.BlockMetadata getDefaultInstanceForType() {
      return alluxio.grpc.table.BlockMetadata.getDefaultInstance();
    }

    public alluxio.grpc.table.BlockMetadata build() {
      alluxio.grpc.table.BlockMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.table.BlockMetadata buildPartial() {
      alluxio.grpc.table.BlockMetadata result = new alluxio.grpc.table.BlockMetadata(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.rowCount_ = rowCount_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.totalByteCount_ = totalByteCount_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.path_ = path_;
      if (colDataBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          colData_ = java.util.Collections.unmodifiableList(colData_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.colData_ = colData_;
      } else {
        result.colData_ = colDataBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.table.BlockMetadata) {
        return mergeFrom((alluxio.grpc.table.BlockMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.table.BlockMetadata other) {
      if (other == alluxio.grpc.table.BlockMetadata.getDefaultInstance()) return this;
      if (other.hasRowCount()) {
        setRowCount(other.getRowCount());
      }
      if (other.hasTotalByteCount()) {
        setTotalByteCount(other.getTotalByteCount());
      }
      if (other.hasPath()) {
        bitField0_ |= 0x00000004;
        path_ = other.path_;
        onChanged();
      }
      if (colDataBuilder_ == null) {
        if (!other.colData_.isEmpty()) {
          if (colData_.isEmpty()) {
            colData_ = other.colData_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureColDataIsMutable();
            colData_.addAll(other.colData_);
          }
          onChanged();
        }
      } else {
        if (!other.colData_.isEmpty()) {
          if (colDataBuilder_.isEmpty()) {
            colDataBuilder_.dispose();
            colDataBuilder_ = null;
            colData_ = other.colData_;
            bitField0_ = (bitField0_ & ~0x00000008);
            colDataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getColDataFieldBuilder() : null;
          } else {
            colDataBuilder_.addAllMessages(other.colData_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.table.BlockMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.table.BlockMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long rowCount_ ;
    /**
     * <code>optional int64 row_count = 1;</code>
     */
    public boolean hasRowCount() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 row_count = 1;</code>
     */
    public long getRowCount() {
      return rowCount_;
    }
    /**
     * <code>optional int64 row_count = 1;</code>
     */
    public Builder setRowCount(long value) {
      bitField0_ |= 0x00000001;
      rowCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 row_count = 1;</code>
     */
    public Builder clearRowCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rowCount_ = 0L;
      onChanged();
      return this;
    }

    private long totalByteCount_ ;
    /**
     * <code>optional int64 total_byte_count = 2;</code>
     */
    public boolean hasTotalByteCount() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 total_byte_count = 2;</code>
     */
    public long getTotalByteCount() {
      return totalByteCount_;
    }
    /**
     * <code>optional int64 total_byte_count = 2;</code>
     */
    public Builder setTotalByteCount(long value) {
      bitField0_ |= 0x00000002;
      totalByteCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_byte_count = 2;</code>
     */
    public Builder clearTotalByteCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      totalByteCount_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <code>optional string path = 3;</code>
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string path = 3;</code>
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          path_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string path = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string path = 3;</code>
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string path = 3;</code>
     */
    public Builder clearPath() {
      bitField0_ = (bitField0_ & ~0x00000004);
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <code>optional string path = 3;</code>
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      path_ = value;
      onChanged();
      return this;
    }

    private java.util.List<alluxio.grpc.table.ColumnChunkMetaData> colData_ =
      java.util.Collections.emptyList();
    private void ensureColDataIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        colData_ = new java.util.ArrayList<alluxio.grpc.table.ColumnChunkMetaData>(colData_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        alluxio.grpc.table.ColumnChunkMetaData, alluxio.grpc.table.ColumnChunkMetaData.Builder, alluxio.grpc.table.ColumnChunkMetaDataOrBuilder> colDataBuilder_;

    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public java.util.List<alluxio.grpc.table.ColumnChunkMetaData> getColDataList() {
      if (colDataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(colData_);
      } else {
        return colDataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public int getColDataCount() {
      if (colDataBuilder_ == null) {
        return colData_.size();
      } else {
        return colDataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public alluxio.grpc.table.ColumnChunkMetaData getColData(int index) {
      if (colDataBuilder_ == null) {
        return colData_.get(index);
      } else {
        return colDataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public Builder setColData(
        int index, alluxio.grpc.table.ColumnChunkMetaData value) {
      if (colDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColDataIsMutable();
        colData_.set(index, value);
        onChanged();
      } else {
        colDataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public Builder setColData(
        int index, alluxio.grpc.table.ColumnChunkMetaData.Builder builderForValue) {
      if (colDataBuilder_ == null) {
        ensureColDataIsMutable();
        colData_.set(index, builderForValue.build());
        onChanged();
      } else {
        colDataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public Builder addColData(alluxio.grpc.table.ColumnChunkMetaData value) {
      if (colDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColDataIsMutable();
        colData_.add(value);
        onChanged();
      } else {
        colDataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public Builder addColData(
        int index, alluxio.grpc.table.ColumnChunkMetaData value) {
      if (colDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColDataIsMutable();
        colData_.add(index, value);
        onChanged();
      } else {
        colDataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public Builder addColData(
        alluxio.grpc.table.ColumnChunkMetaData.Builder builderForValue) {
      if (colDataBuilder_ == null) {
        ensureColDataIsMutable();
        colData_.add(builderForValue.build());
        onChanged();
      } else {
        colDataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public Builder addColData(
        int index, alluxio.grpc.table.ColumnChunkMetaData.Builder builderForValue) {
      if (colDataBuilder_ == null) {
        ensureColDataIsMutable();
        colData_.add(index, builderForValue.build());
        onChanged();
      } else {
        colDataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public Builder addAllColData(
        java.lang.Iterable<? extends alluxio.grpc.table.ColumnChunkMetaData> values) {
      if (colDataBuilder_ == null) {
        ensureColDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, colData_);
        onChanged();
      } else {
        colDataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public Builder clearColData() {
      if (colDataBuilder_ == null) {
        colData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        colDataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public Builder removeColData(int index) {
      if (colDataBuilder_ == null) {
        ensureColDataIsMutable();
        colData_.remove(index);
        onChanged();
      } else {
        colDataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public alluxio.grpc.table.ColumnChunkMetaData.Builder getColDataBuilder(
        int index) {
      return getColDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public alluxio.grpc.table.ColumnChunkMetaDataOrBuilder getColDataOrBuilder(
        int index) {
      if (colDataBuilder_ == null) {
        return colData_.get(index);  } else {
        return colDataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public java.util.List<? extends alluxio.grpc.table.ColumnChunkMetaDataOrBuilder> 
         getColDataOrBuilderList() {
      if (colDataBuilder_ != null) {
        return colDataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(colData_);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public alluxio.grpc.table.ColumnChunkMetaData.Builder addColDataBuilder() {
      return getColDataFieldBuilder().addBuilder(
          alluxio.grpc.table.ColumnChunkMetaData.getDefaultInstance());
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public alluxio.grpc.table.ColumnChunkMetaData.Builder addColDataBuilder(
        int index) {
      return getColDataFieldBuilder().addBuilder(
          index, alluxio.grpc.table.ColumnChunkMetaData.getDefaultInstance());
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnChunkMetaData col_data = 4;</code>
     */
    public java.util.List<alluxio.grpc.table.ColumnChunkMetaData.Builder> 
         getColDataBuilderList() {
      return getColDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        alluxio.grpc.table.ColumnChunkMetaData, alluxio.grpc.table.ColumnChunkMetaData.Builder, alluxio.grpc.table.ColumnChunkMetaDataOrBuilder> 
        getColDataFieldBuilder() {
      if (colDataBuilder_ == null) {
        colDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            alluxio.grpc.table.ColumnChunkMetaData, alluxio.grpc.table.ColumnChunkMetaData.Builder, alluxio.grpc.table.ColumnChunkMetaDataOrBuilder>(
                colData_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        colData_ = null;
      }
      return colDataBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.table.BlockMetadata)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.table.BlockMetadata)
  private static final alluxio.grpc.table.BlockMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.table.BlockMetadata();
  }

  public static alluxio.grpc.table.BlockMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<BlockMetadata>
      PARSER = new com.google.protobuf.AbstractParser<BlockMetadata>() {
    public BlockMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlockMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlockMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlockMetadata> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.table.BlockMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
