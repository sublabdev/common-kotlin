package dev.sublab.common.numerics

import java.math.BigInteger

@Suppress("unused")
data class Int128(val value: BigInteger) {
    companion object {
        const val SIZE_BYTES: Int = 16
    }

    constructor(stringValue: String) : this(BigInteger(stringValue))
}

@Suppress("unused")
fun ByteArray.toInt128() = Int128(BigInteger(1, reversedArray()))
fun Int128.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(Int128::class))