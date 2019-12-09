# 疑问
``alluxio.underfs.UfsManager``中有
```
    public CloseableResource<UnderFileSystem> acquireUfsResource() {
      if (mUfs.get() == null) {
        UnderFileSystem ufs = mUfsSupplier.get();
        if (!mUfs.compareAndSet(null, ufs)) {//为什么要关闭？fs一个耗时对象，为什么不缓存？
          // Another thread already added this ufs, close this one.
          try {
            ufs.close();
          } catch (IOException e) {
            // ignore the close exception, log a warning
            LOG.warn(String
                .format("Failed to close extra UFS. mount point: %s error: %s", mUfsMountPointUri,
                    e.toString()));
          }
        }
      }
      mCounter.inc();
      return new CloseableResource<UnderFileSystem>(mUfs.get()) {
        @Override
        public void close() {
          mCounter.dec();
        }
      };
    }
```
为什么要关闭已有的？？

