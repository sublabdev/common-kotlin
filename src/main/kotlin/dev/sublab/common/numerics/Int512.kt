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

import java.math.BigInteger

/**
 * Int512 wrapper over BigInteger
 * @property value BigInteger value to be wrapped
 */
@Suppress("unused")
data class Int512(val value: BigInteger) {
    companion object {
        const val SIZE_BYTES: Int = 64
    }

    /**
     * @constructor creates Int512 from String
     * @param stringValue String to be converted into Int512
     */
    constructor(stringValue: String) : this(BigInteger(stringValue))

    /**
     * @constructor creates Int512 from Int8 (Byte)
     * @param int8Value Int8 (Byte) to be converted into Int512
     */
    constructor(int8Value: Int8) : this(int8Value.toInt())

    /**
     * @constructor creates Int512 from Int16 (Short)
     * @param int16Value Int16 (Short) to be converted into Int512
     */
    constructor(int16Value: Int16) : this(int16Value.toInt())

    /**
     * @constructor creates Int512 from Int32 (Int)
     * @param int32Value Int32 (Int) to be converted into Int512
     */
    constructor(int32Value: Int32) : this(int32Value.toBigInteger())

    /**
     * @constructor creates Int512 from Int64 (Long)
     * @param int64Value Int64 (Long) to be converted into Int512
     */
    constructor(int64Value: Int64) : this(int64Value.toBigInteger())

    /**
     * @constructor creates Int512 from Int128
     * @param int128Value Int128 to be converted into Int512
     */
    constructor(int128Value: Int128) : this(int128Value.value)

    /**
     * @constructor creates Int512 from Int256
     * @param int256Value Int256 to be converted into Int512
     */
    constructor(int256Value: Int256) : this(int256Value.value)
}

/**
 * Converts ByteArray into Int512
 */
@Suppress("unused")
fun ByteArray.toInt512() = Int512(BigInteger(1, reversedArray()))

/**
 * Converts Int512 to ByteArray
 */
fun Int512.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(Int512::class))

/**
 * Converts Int8 (Byte) to Int512
 */
@Suppress("unused")
fun Int8.toInt512() = Int512(this)

/**
 * Converts Int16 (Short) to Int512
 */
@Suppress("unused")
fun Int16.toInt512() = Int512(this)

/**
 * Converts Int32 (Int) to Int512
 */
@Suppress("unused")
fun Int32.toInt512() = Int512(this)

/**
 * Converts Int64 (Long) to Int512
 */
@Suppress("unused")
fun Int64.toInt512() = Int512(this)

/**
 * Converts Int128 to Int512
 */
@Suppress("unused")
fun Int128.toInt512() = Int512(this)

/**
 * Converts Int256 to Int512
 */
@Suppress("unused")
fun Int256.toInt512() = Int512(this)