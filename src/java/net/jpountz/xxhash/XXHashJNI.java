package net.jpountz.xxhash;

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

import net.jpountz.util.Native;

enum XXHashJNI {
  ;

  static {
    Native.load();
    init();
  }

  private static native void init();
  static native int XXH32(byte[] input, int offset, int len, int seed);
  static native long XXH32_init(int seed);
  static native void XXH32_feed(long state, byte[] input, int offset, int len);
  static native int XXH32_getIntermediateResult(long state);
  static native int XXH32_result(long state);
  static native void XXH32_free(long state);

}
