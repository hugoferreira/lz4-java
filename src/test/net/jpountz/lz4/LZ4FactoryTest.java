package net.jpountz.lz4;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import junit.framework.TestCase;

public class LZ4FactoryTest extends TestCase {

  public void test() {
    assertEquals(LZ4JNICompressor.FAST, LZ4Factory.nativeInstance().fastCompressor());
    assertEquals(LZ4JNICompressor.HIGH_COMPRESSION, LZ4Factory.nativeInstance().highCompressor());
    assertEquals(LZ4JavaUnsafeCompressor.FAST, LZ4Factory.unsafeInstance().fastCompressor());
    assertEquals(LZ4JavaUnsafeCompressor.HIGH_COMPRESSION, LZ4Factory.unsafeInstance().highCompressor());
    assertEquals(LZ4JavaSafeCompressor.FAST, LZ4Factory.safeInstance().fastCompressor());
    assertEquals(LZ4JavaSafeCompressor.HIGH_COMPRESSION, LZ4Factory.safeInstance().highCompressor());

    assertEquals(LZ4JNIDecompressor.INSTANCE, LZ4Factory.nativeInstance().decompressor());
    assertEquals(LZ4JavaUnsafeDecompressor.INSTANCE, LZ4Factory.unsafeInstance().decompressor());
    assertEquals(LZ4JavaSafeDecompressor.INSTANCE, LZ4Factory.safeInstance().decompressor());

    assertEquals(LZ4JNIUnknownSizeDecompressor.INSTANCE, LZ4Factory.nativeInstance().unknwonSizeDecompressor());
    assertEquals(LZ4JavaUnsafeUnknownSizeDecompressor.INSTANCE, LZ4Factory.unsafeInstance().unknwonSizeDecompressor());
    assertEquals(LZ4JavaSafeUnknownSizeDecompressor.INSTANCE, LZ4Factory.safeInstance().unknwonSizeDecompressor());
  }

}
