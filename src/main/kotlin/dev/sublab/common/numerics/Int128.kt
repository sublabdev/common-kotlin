package dev.sublab.common.numerics

import java.math.BigInteger

/**
 * [Int128] wrapper over [BigInteger]
 * @property value [BigInteger] value to be wrapped
 */
@Suppress("unused")
data class Int128(val value: BigInteger) {
    companion object {
        const val SIZE_BYTES: Int = 16
    }

    /**
     * @constructor creates [Int128] from [String]
     * @param stringValue String to be converted into Int128
     */
    constructor(stringValue: String) : this(BigInteger(stringValue))

    /**
     * @constructor creates [Int128] from [Int8] ([Byte])
     * @param int8Value Int8 (Byte) to be converted into Int128
     */
    constructor(int8Value: Int8) : this(int8Value.toInt())

    /**
     * @constructor creates [Int128] from [Int16] ([Short])
     * @param int16Value Int16 (Short) to be converted into Int128
     */
    constructor(int16Value: Int16) : this(int16Value.toInt())

    /**
     * @constructor creates [Int128] from [Int32] ([Int])
     * @param int32Value Int32 (Int) to be converted into Int128
     */
    constructor(int32Value: Int32) : this(int32Value.toBigInteger())

    /**
     * @constructor creates [Int128] from [Int64] ([Long])
     * @param int64Value [Int64] ([Long]) to be converted into [Int128]
     */
    constructor(int64Value: Int64) : this(int64Value.toBigInteger())
}

/**
 * Converts [ByteArray] into [Int128]
 */
@Suppress("unused")
fun ByteArray.toInt128() = Int128(BigInteger(1, reversedArray()))

/**
 * Converts [Int128] to [ByteArray]
 */
fun Int128.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(Int128::class))

/**
 * Converts [Int8] ([Byte]) to [Int128]
 */
@Suppress("unused")
fun Int8.toInt128() = Int128(this)

/**
 * Converts [Int16] ([Short]) to [Int128]
 */
@Suppress("unused")
fun Int16.toInt128() = Int128(this)

/**
 * Converts [Int32] ([Int]) to [Int128]
 */
@Suppress("unused")
fun Int32.toInt128() = Int128(this)

/**
 * Converts [Int64] ([Long]) to [Int128]
 */
@Suppress("unused")
fun Int64.toInt128() = Int128(this)