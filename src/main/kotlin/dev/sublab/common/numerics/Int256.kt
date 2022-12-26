package dev.sublab.common.numerics

import java.math.BigInteger

@Suppress("unused")
data class Int256(val value: BigInteger) {
    companion object {
        const val SIZE_BYTES: Int = 32
    }

    constructor(stringValue: String) : this(BigInteger(stringValue))
    constructor(int8Value: Int8) : this(int8Value.toInt())
    constructor(int16Value: Int16) : this(int16Value.toInt())
    constructor(int32Value: Int32) : this(int32Value.toBigInteger())
    constructor(int64Value: Int64) : this(int64Value.toBigInteger())
    constructor(int128Value: Int128) : this(int128Value.value)
}

@Suppress("unused")
fun ByteArray.toInt256() = Int256(BigInteger(1, reversedArray()))
fun Int256.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(Int256::class))

@Suppress("unused")
fun Int8.toInt256() = Int256(this)
@Suppress("unused")
fun Int16.toInt256() = Int256(this)
@Suppress("unused")
fun Int32.toInt256() = Int256(this)
@Suppress("unused")
fun Int64.toInt256() = Int256(this)
@Suppress("unused")
fun Int128.toInt256() = Int256(this)