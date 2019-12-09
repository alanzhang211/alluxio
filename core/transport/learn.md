# 模块梳理
使用grpc进行远程调用组件实体。

## grpc


## proto
和 `.proto`文件对应

### dataserver
作用：数据传输服务

### journal
实体对象
#### Block
数据block

#### 文件
文件元数据

#### Journal


#### Meta
元数据，master会管理集群元数据信息。

#### Table
表schema元数据信息：库名，表名，表描述等
