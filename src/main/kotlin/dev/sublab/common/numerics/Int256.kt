package dev.sublab.common.numerics

import java.math.BigInteger

data class Int256(val value: BigInteger)

fun ByteArray.toInt256() = Int256(BigInteger(1, reversedArray()))
fun Int256.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(Int256::class))