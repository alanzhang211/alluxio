// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.FileStatistics}
 */
public  final class FileStatistics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.FileStatistics)
    FileStatisticsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FileStatistics.newBuilder() to construct.
  private FileStatistics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileStatistics() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FileStatistics(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              column_ = com.google.protobuf.MapField.newMapField(
                  ColumnDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, alluxio.grpc.ColumnStatistics>
            column__ = input.readMessage(
                ColumnDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            column_.getMutableMap().put(
                column__.getKey(), column__.getValue());
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_FileStatistics_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetColumn();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_FileStatistics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.FileStatistics.class, alluxio.grpc.FileStatistics.Builder.class);
  }

  public static final int COLUMN_FIELD_NUMBER = 1;
  private static final class ColumnDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, alluxio.grpc.ColumnStatistics> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, alluxio.grpc.ColumnStatistics>newDefaultInstance(
                alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_FileStatistics_ColumnEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                alluxio.grpc.ColumnStatistics.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, alluxio.grpc.ColumnStatistics> column_;
  private com.google.protobuf.MapField<java.lang.String, alluxio.grpc.ColumnStatistics>
  internalGetColumn() {
    if (column_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ColumnDefaultEntryHolder.defaultEntry);
    }
    return column_;
  }

  public int getColumnCount() {
    return internalGetColumn().getMap().size();
  }
  /**
   * <pre>
   *map column names to column statistics
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.ColumnStatistics&gt; column = 1;</code>
   */

  public boolean containsColumn(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetColumn().getMap().containsKey(key);
  }
  /**
   * Use {@link #getColumnMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, alluxio.grpc.ColumnStatistics> getColumn() {
    return getColumnMap();
  }
  /**
   * <pre>
   *map column names to column statistics
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.ColumnStatistics&gt; column = 1;</code>
   */

  public java.util.Map<java.lang.String, alluxio.grpc.ColumnStatistics> getColumnMap() {
    return internalGetColumn().getMap();
  }
  /**
   * <pre>
   *map column names to column statistics
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.ColumnStatistics&gt; column = 1;</code>
   */

  public alluxio.grpc.ColumnStatistics getColumnOrDefault(
      java.lang.String key,
      alluxio.grpc.ColumnStatistics defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, alluxio.grpc.ColumnStatistics> map =
        internalGetColumn().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   *map column names to column statistics
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.ColumnStatistics&gt; column = 1;</code>
   */

  public alluxio.grpc.ColumnStatistics getColumnOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, alluxio.grpc.ColumnStatistics> map =
        internalGetColumn().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetColumn(),
        ColumnDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, alluxio.grpc.ColumnStatistics> entry
         : internalGetColumn().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, alluxio.grpc.ColumnStatistics>
      column__ = ColumnDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, column__);
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
    if (!(obj instanceof alluxio.grpc.FileStatistics)) {
      return super.equals(obj);
    }
    alluxio.grpc.FileStatistics other = (alluxio.grpc.FileStatistics) obj;

    boolean result = true;
    result = result && internalGetColumn().equals(
        other.internalGetColumn());
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
    if (!internalGetColumn().getMap().isEmpty()) {
      hash = (37 * hash) + COLUMN_FIELD_NUMBER;
      hash = (53 * hash) + internalGetColumn().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.FileStatistics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.FileStatistics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.FileStatistics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.FileStatistics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.FileStatistics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.FileStatistics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.FileStatistics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.FileStatistics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.FileStatistics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.FileStatistics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.FileStatistics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.FileStatistics parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.FileStatistics prototype) {
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
   * Protobuf type {@code alluxio.grpc.FileStatistics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.FileStatistics)
      alluxio.grpc.FileStatisticsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_FileStatistics_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetColumn();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableColumn();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_FileStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.FileStatistics.class, alluxio.grpc.FileStatistics.Builder.class);
    }

    // Construct using alluxio.grpc.FileStatistics.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      internalGetMutableColumn().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_FileStatistics_descriptor;
    }

    public alluxio.grpc.FileStatistics getDefaultInstanceForType() {
      return alluxio.grpc.FileStatistics.getDefaultInstance();
    }

    public alluxio.grpc.FileStatistics build() {
      alluxio.grpc.FileStatistics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.FileStatistics buildPartial() {
      alluxio.grpc.FileStatistics result = new alluxio.grpc.FileStatistics(this);
      int from_bitField0_ = bitField0_;
      result.column_ = internalGetColumn();
      result.column_.makeImmutable();
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
      if (other instanceof alluxio.grpc.FileStatistics) {
        return mergeFrom((alluxio.grpc.FileStatistics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.FileStatistics other) {
      if (other == alluxio.grpc.FileStatistics.getDefaultInstance()) return this;
      internalGetMutableColumn().mergeFrom(
          other.internalGetColumn());
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
      alluxio.grpc.FileStatistics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.FileStatistics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, alluxio.grpc.ColumnStatistics> column_;
    private com.google.protobuf.MapField<java.lang.String, alluxio.grpc.ColumnStatistics>
    internalGetColumn() {
      if (column_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ColumnDefaultEntryHolder.defaultEntry);
      }
      return column_;
    }
    private com.google.protobuf.MapField<java.lang.String, alluxio.grpc.ColumnStatistics>
    internalGetMutableColumn() {
      onChanged();;
      if (column_ == null) {
        column_ = com.google.protobuf.MapField.newMapField(
            ColumnDefaultEntryHolder.defaultEntry);
      }
      if (!column_.isMutable()) {
        column_ = column_.copy();
      }
      return column_;
    }

    public int getColumnCount() {
      return internalGetColumn().getMap().size();
    }
    /**
     * <pre>
     *map column names to column statistics
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.ColumnStatistics&gt; column = 1;</code>
     */

    public boolean containsColumn(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetColumn().getMap().containsKey(key);
    }
    /**
     * Use {@link #getColumnMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, alluxio.grpc.ColumnStatistics> getColumn() {
      return getColumnMap();
    }
    /**
     * <pre>
     *map column names to column statistics
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.ColumnStatistics&gt; column = 1;</code>
     */

    public java.util.Map<java.lang.String, alluxio.grpc.ColumnStatistics> getColumnMap() {
      return internalGetColumn().getMap();
    }
    /**
     * <pre>
     *map column names to column statistics
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.ColumnStatistics&gt; column = 1;</code>
     */

    public alluxio.grpc.ColumnStatistics getColumnOrDefault(
        java.lang.String key,
        alluxio.grpc.ColumnStatistics defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, alluxio.grpc.ColumnStatistics> map =
          internalGetColumn().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     *map column names to column statistics
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.ColumnStatistics&gt; column = 1;</code>
     */

    public alluxio.grpc.ColumnStatistics getColumnOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, alluxio.grpc.ColumnStatistics> map =
          internalGetColumn().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearColumn() {
      internalGetMutableColumn().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     *map column names to column statistics
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.ColumnStatistics&gt; column = 1;</code>
     */

    public Builder removeColumn(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableColumn().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, alluxio.grpc.ColumnStatistics>
    getMutableColumn() {
      return internalGetMutableColumn().getMutableMap();
    }
    /**
     * <pre>
     *map column names to column statistics
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.ColumnStatistics&gt; column = 1;</code>
     */
    public Builder putColumn(
        java.lang.String key,
        alluxio.grpc.ColumnStatistics value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableColumn().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     *map column names to column statistics
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.ColumnStatistics&gt; column = 1;</code>
     */

    public Builder putAllColumn(
        java.util.Map<java.lang.String, alluxio.grpc.ColumnStatistics> values) {
      internalGetMutableColumn().getMutableMap()
          .putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.FileStatistics)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.FileStatistics)
  private static final alluxio.grpc.FileStatistics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.FileStatistics();
  }

  public static alluxio.grpc.FileStatistics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<FileStatistics>
      PARSER = new com.google.protobuf.AbstractParser<FileStatistics>() {
    public FileStatistics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FileStatistics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FileStatistics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileStatistics> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.FileStatistics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

