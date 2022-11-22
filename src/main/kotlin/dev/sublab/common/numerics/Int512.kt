package dev.sublab.common.numerics

import java.math.BigInteger

data class Int512(val value: BigInteger) {
    companion object {
        const val SIZE_BYTES: Int = 64
    }
}

fun ByteArray.toInt512() = Int512(BigInteger(1, reversedArray()))
fun Int512.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(Int512::class))