package dev.sublab.common.numerics

import java.math.BigInteger

data class Int128(val value: BigInteger)

fun ByteArray.toInt128() = Int128(BigInteger(1, reversedArray()))
fun Int128.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(Int128::class))