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

package dev.sublab.common

/**
 * An interface for converting object to [ByteArray]
 */
interface ByteArrayConvertible {
    /**
     * Converts object to [ByteArray]
     */
    fun toByteArray(): ByteArray
}

/**
 * Converts [String] to [ByteArray]
 */
@Suppress("unused")
fun String.asByteArrayConvertible() = object : ByteArrayConvertible {
    override fun toByteArray() = this@asByteArrayConvertible.toByteArray()
}

@Suppress("unused")
fun ByteArray.asByteArrayConvertible() = object : ByteArrayConvertible {
    override fun toByteArray() = this@asByteArrayConvertible
}

abstract class FromByteArray(byteArray: ByteArray): ByteArrayConvertible