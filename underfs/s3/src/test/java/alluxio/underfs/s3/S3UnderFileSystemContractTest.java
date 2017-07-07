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

package alluxio.underfs.s3;

import alluxio.exception.PreconditionMessage;
import alluxio.underfs.AbstractUnderFileSystemContractTest;
import alluxio.underfs.UnderFileSystem;
import alluxio.underfs.UnderFileSystemConfiguration;

import com.google.common.base.Preconditions;
import org.junit.BeforeClass;

/**
 * This UFS contract test will use Amazon S3 as the backing store.
 */
public final class S3UnderFileSystemContractTest extends AbstractUnderFileSystemContractTest {
  private static final String S3_BUCKET_CONF = "testS3Bucket";
  private static final String S3_BUCKET = System.getProperty(S3_BUCKET_CONF);

  @BeforeClass
  public static void beforeClass() throws Exception {
    Preconditions.checkNotNull(S3_BUCKET,
        PreconditionMessage.S3_BUCKET_MUST_BE_SET.toString(), S3_BUCKET);
    Preconditions.checkState(new S3UnderFileSystemFactory().supportsPath(S3_BUCKET),
        String.format("%s is not a valid S3 path", S3_BUCKET));
  }

  @Override
  public UnderFileSystem createUfs(String path, UnderFileSystemConfiguration conf)
      throws Exception {
    return new S3UnderFileSystemFactory().create(path, conf);
  }

  @Override
  public String getUfsBaseDir() {
    return S3_BUCKET;
  }
}
