package dev.sublab.common.numerics

import java.math.BigInteger

@Suppress("unused")
data class Int512(val value: BigInteger) {
    companion object {
        const val SIZE_BYTES: Int = 64
    }

    constructor(stringValue: String) : this(BigInteger(stringValue))
    constructor(int8Value: Int8) : this(int8Value.toInt())
    constructor(int16Value: Int16) : this(int16Value.toInt())
    constructor(int32Value: Int32) : this(int32Value.toBigInteger())
    constructor(int64Value: Int64) : this(int64Value.toBigInteger())
    constructor(int128Value: Int128) : this(int128Value.value)
    constructor(int256Value: Int256) : this(int256Value.value)
}

@Suppress("unused")
fun ByteArray.toInt512() = Int512(BigInteger(1, reversedArray()))
fun Int512.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(Int512::class))

@Suppress("unused")
fun Int8.toInt512() = Int512(this)
@Suppress("unused")
fun Int16.toInt512() = Int512(this)
@Suppress("unused")
fun Int32.toInt512() = Int512(this)
@Suppress("unused")
fun Int64.toInt512() = Int512(this)
@Suppress("unused")
fun Int128.toInt512() = Int512(this)
@Suppress("unused")
fun Int256.toInt512() = Int512(this)