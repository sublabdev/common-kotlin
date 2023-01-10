package dev.sublab.common.numerics

import java.math.BigInteger

/**
 * UInt512 wrapper over BigInteger
 * @property value BigInteger value to be wrapped
 */
@Suppress("unused")
data class UInt512(val value: BigInteger) {
    companion object {
        const val SIZE_BYTES: Int = 64
    }

    /**
     * @constructor creates UInt512 from String
     * @param stringValue String to be converted into UInt512
     */
    constructor(stringValue: String) : this(BigInteger(stringValue))

    /**
     * @constructor creates UInt512 from UInt8 (UByte)
     * @param uint8Value UInt8 (UByte) to be converted into UInt512
     */
    constructor(uint8Value: UInt8) : this(uint8Value.toUInt())

    /**
     * @constructor creates UInt512 from UInt16 (UShort)
     * @param uint16Value UInt16 (UShort) to be converted into UInt512
     */
    constructor(uint16Value: UInt16) : this(uint16Value.toUInt())

    /**
     * @constructor creates UInt512 from UInt32 (UInt)
     * @param uint32Value UInt32 (UInt) to be converted into UInt512
     */
    constructor(uint32Value: UInt32) : this(BigInteger.valueOf(uint32Value.toLong()))

    /**
     * @constructor creates UInt512 from UInt64 (ULong)
     * @param uint64Value UInt64 (ULong) to be converted into UInt512
     */
    constructor(uint64Value: UInt64) : this(BigInteger.valueOf(uint64Value.toLong()))

    /**
     * @constructor creates UInt512 from UInt128
     * @param uint128Value Int128 to be converted into UInt512
     */
    constructor(uint128Value: UInt128) : this(uint128Value.value)

    /**
     * @constructor creates UInt512 from UInt256
     * @param uint256Value UInt256 to be converted into UInt512
     */
    constructor(uint256Value: UInt256) : this(uint256Value.value)
}

/**
 * Converts ByteArray to UInt512
 */
@Suppress("unused")
fun ByteArray.toUInt512() = UInt512(BigInteger(1, reversedArray()))

/**
 * Converts UInt512 to ByteArray
 */
fun UInt512.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(UInt512::class))

/**
 * Converts UInt8 (UByte) to UInt512
 */
@Suppress("unused")
fun UInt8.toUInt512() = UInt512(this)

/**
 * Converts UInt16 (UShort) to UInt512
 */
@Suppress("unused")
fun UInt16.toUInt512() = UInt512(this)

/**
 * Converts UInt32 (UInt) to UInt512
 */
@Suppress("unused")
fun UInt32.toUInt512() = UInt512(this)

/**
 * Converts UInt64 (ULong) to UInt512
 */
@Suppress("unused")
fun UInt64.toUInt512() = UInt512(this)

/**
 * Converts UInt128 to UInt512
 */
@Suppress("unused")
fun UInt128.toUInt512() = UInt512(this)

/**
 * Converts UInt256 to UInt512
 */
@Suppress("unused")
fun UInt256.toUInt512() = UInt512(this)