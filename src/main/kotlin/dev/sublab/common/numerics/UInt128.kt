package dev.sublab.common.numerics

import java.math.BigInteger

data class UInt128(val value: BigInteger) {
    companion object {
        const val SIZE_BYTES: Int = 16
    }
}

fun ByteArray.toUInt128() = UInt128(BigInteger(1, reversedArray()))
fun UInt128.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(UInt128::class))