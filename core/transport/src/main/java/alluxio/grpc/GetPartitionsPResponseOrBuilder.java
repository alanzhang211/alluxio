// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog_master.proto

package alluxio.grpc;

public interface GetPartitionsPResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.GetPartitionsPResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .alluxio.grpc.PartitionInfo partitions = 1;</code>
   */
  java.util.List<alluxio.grpc.PartitionInfo> 
      getPartitionsList();
  /**
   * <code>repeated .alluxio.grpc.PartitionInfo partitions = 1;</code>
   */
  alluxio.grpc.PartitionInfo getPartitions(int index);
  /**
   * <code>repeated .alluxio.grpc.PartitionInfo partitions = 1;</code>
   */
  int getPartitionsCount();
  /**
   * <code>repeated .alluxio.grpc.PartitionInfo partitions = 1;</code>
   */
  java.util.List<? extends alluxio.grpc.PartitionInfoOrBuilder> 
      getPartitionsOrBuilderList();
  /**
   * <code>repeated .alluxio.grpc.PartitionInfo partitions = 1;</code>
   */
  alluxio.grpc.PartitionInfoOrBuilder getPartitionsOrBuilder(
      int index);
}
