## 知识点
### ResourcePool
生产者-消费者 模式。

### heartbeat 心跳逻辑
Lock、condition

### BaseFileSystem
alluxio client都是通过BaseFileSystem 来进行文件操作，操作类`FileSystemOptions`。

引申：
1. [顺代温故下设计模式-创建型模式](https://design-patterns.readthedocs.io/zh_CN/latest/creational_patterns/creational.html)

#### 核心对象
变量都是`final`修饰，都是常量，引用类型的地址不能改变。在构造函数中初始化或直接初始化。
``AlluxioBlockStore``:block的管理。

`mCachingEnabled`:是否开启缓存，如果开启从fileSystem cache中拿到fileSystem实例。默认不开启。为什么？可见下面资料：
[hdfs的FileSystem实例化](https://www.cnblogs.com/ulysses-you/p/7930903.html)

> Factory.FILESYSTEM_CACHE 是一个FileSystem 内部类Cache。结构是ConcurrentHashMap。
> 其中，get方法调用了底层的 computeIfAbsent 方法。

引申：
1. [java8 Map中的computeIfAbsent方法](https://blog.csdn.net/wang704987562/article/details/79292230)
2. [java 8 hashMap新增方法](https://www.jianshu.com/p/7e309963d018)


#### 核心数据结构

