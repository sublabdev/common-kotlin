/**
 *
 * Copyright 2023 SUBSTRATE LABORATORY LLC <info@sublab.dev>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package dev.sublab.hex

class ByteArrayHex(private val byteArray: ByteArray) {
    /**
     * Encodes [ByteArray] into hex [String]
     * @param includePrefix [Bool] value indicating whether the prefix should be included in the returned hex String
     * @return A hex-encoded [String] either with a prefix or without
     */
    fun encode(includePrefix: Boolean = false): String {
        val encoded = byteArray.joinToString(separator = "") { "%02x".format(it) }
        val prefix = if (includePrefix) "0x" else ""
        return prefix+encoded
    }
}

/**
 * [ByteArray] to hex-encoded [String] converter
 */
val ByteArray.hex
    get() = ByteArrayHex(this)