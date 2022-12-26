package dev.sublab.common.numerics

import java.math.BigInteger

@Suppress("unused")
data class Int128(val value: BigInteger) {
    companion object {
        const val SIZE_BYTES: Int = 16
    }

    constructor(stringValue: String) : this(BigInteger(stringValue))
    constructor(int8Value: Int8) : this(int8Value.toInt())
    constructor(int16Value: Int16) : this(int16Value.toInt())
    constructor(int32Value: Int32) : this(int32Value.toBigInteger())
    constructor(int64Value: Int64) : this(int64Value.toBigInteger())
}

@Suppress("unused")
fun ByteArray.toInt128() = Int128(BigInteger(1, reversedArray()))
fun Int128.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(Int128::class))

@Suppress("unused")
fun Int8.toInt128() = Int128(this)
@Suppress("unused")
fun Int16.toInt128() = Int128(this)
@Suppress("unused")
fun Int32.toInt128() = Int128(this)
@Suppress("unused")
fun Int64.toInt128() = Int128(this)