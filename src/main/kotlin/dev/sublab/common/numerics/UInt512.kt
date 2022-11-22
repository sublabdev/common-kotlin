package dev.sublab.common.numerics

import java.math.BigInteger

data class UInt512(val value: BigInteger) {
    companion object {
        const val SIZE_BYTES: Int = 64
    }
}

fun ByteArray.toUInt512() = UInt512(BigInteger(1, reversedArray()))
fun UInt512.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(UInt512::class))