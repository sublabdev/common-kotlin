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
 * UInt256 wrapper over BigInteger
 * @property value BigInteger value to be wrapped
 */
@Suppress("unused")
data class UInt256(val value: BigInteger) {
    companion object {
        const val SIZE_BYTES: Int = 32
    }

    /**
     * @constructor creates UInt256 from String
     * @param stringValue String to be converted into UInt256
     */
    constructor(stringValue: String) : this(BigInteger(stringValue))

    /**
     * @constructor creates UInt256 from UInt8 (UByte)
     * @param uint8Value UInt8 (UByte) to be converted into UInt256
     */
    constructor(uint8Value: UInt8) : this(uint8Value.toUInt())

    /**
     * @constructor creates UInt256 from UInt16 (UShort)
     * @param uint16Value UInt16 (UShort) to be converted into UInt256
     */
    constructor(uint16Value: UInt16) : this(uint16Value.toUInt())

    /**
     * @constructor creates UInt256 from UInt32 (UInt)
     * @param uint32Value UInt32 (UInt) to be converted into UInt256
     */
    constructor(uint32Value: UInt32) : this(BigInteger.valueOf(uint32Value.toLong()))

    /**
     * @constructor creates UInt256 from UInt64 (ULong)
     * @param uint64Value UInt64 (ULong) to be converted into UInt256
     */
    constructor(uint64Value: UInt64) : this(BigInteger.valueOf(uint64Value.toLong()))

    /**
     * @constructor creates UInt256 from UInt128
     * @param uint128Value UInt128 to be converted into UInt256
     */
    constructor(uint128Value: UInt128) : this(uint128Value.value)
}

/**
 * Converts ByteArray into UInt256
 */
@Suppress("unused")
fun ByteArray.toUInt256() = UInt256(BigInteger(1, reversedArray()))

/**
 * Converts UInt256 to ByteArray
 */
fun UInt256.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(UInt256::class))

/**
 * Converts UInt8 (UByte) to UInt256
 */
@Suppress("unused")
fun UInt8.toUInt256() = UInt512(this)

/**
 * Converts UInt16 (UShort) to UInt256
 */
@Suppress("unused")
fun UInt16.toUInt256() = UInt512(this)

/**
 * Converts UInt32 (UInt) to UInt256
 */
@Suppress("unused")
fun UInt32.toUInt256() = UInt512(this)

/**
 * Converts UInt64 (ULong) to UInt256
 */
@Suppress("unused")
fun UInt64.toUInt256() = UInt512(this)

/**
 * Converts UInt128 to UInt256
 */
@Suppress("unused")
fun UInt128.toUInt256() = UInt512(this)