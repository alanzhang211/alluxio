// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog/catalog_master.proto

package alluxio.grpc.catalog;

public interface BooleanColumnStatsDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.catalog.BooleanColumnStatsData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 numTrues = 1;</code>
   */
  boolean hasNumTrues();
  /**
   * <code>optional int64 numTrues = 1;</code>
   */
  long getNumTrues();

  /**
   * <code>optional int64 numFalses = 2;</code>
   */
  boolean hasNumFalses();
  /**
   * <code>optional int64 numFalses = 2;</code>
   */
  long getNumFalses();

  /**
   * <code>optional int64 numNulls = 3;</code>
   */
  boolean hasNumNulls();
  /**
   * <code>optional int64 numNulls = 3;</code>
   */
  long getNumNulls();

  /**
   * <code>optional string bitVectors = 4;</code>
   */
  boolean hasBitVectors();
  /**
   * <code>optional string bitVectors = 4;</code>
   */
  java.lang.String getBitVectors();
  /**
   * <code>optional string bitVectors = 4;</code>
   */
  com.google.protobuf.ByteString
      getBitVectorsBytes();
}