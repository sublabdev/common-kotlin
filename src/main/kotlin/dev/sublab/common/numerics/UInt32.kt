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

package dev.sublab.common.numerics

/**
 * Converts UInt32 (UInt) to ByteArray
 */
fun UInt32.toByteArray() = byteRangeForNumeric(UInt32::class)
    .map { this shr it }
    .map { it.toByte() }
    .toByteArray()

/**
 * Converts ByteArray to UInt
 */
fun ByteArray.toUInt() = foldIndexed(0U) { i, result, byte ->
    result or (byte.toUByte().toUInt() shl 8 * i)
}

/**
 * Converts ByteArray to UInt32 (UInt)
 */
@Suppress("unused")
fun ByteArray.toUInt32() = toUInt()