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

/**
 * LZ4 compressor.
 */
public interface LZ4Compressor {

  /** Return the maximum compressed length for an input of size <code>length</code>. */
  int maxCompressedLength(int length);

  /**
   * Compress <code>src[srcOff:srcOff+srcLen]</code> into
   * <code>dest[destOff:destOff+destLen]</code> and return the compressed
   * length.
   *
   * This method will throw a {@link LZ4Exception} if this compressor is unable
   * to compress the input into less than <code>maxDestLen</code> bytes. To
   * prevent this exception to be thrown, you should make sure that
   * <code>maxDestLen >= maxCompressedLength(srcLen)</code>.
   *
   * @throws LZ4Exception if maxDestLen is too small
   * @return the compressed size
   */
  int compress(byte[] src, int srcOff, int srcLen, byte[] dest, int destOff, int maxDestLen);

}
