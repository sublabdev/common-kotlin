package dev.sublab.common.numerics

import java.math.BigInteger

data class UInt256(val value: BigInteger)

fun ByteArray.toUInt256() = UInt256(BigInteger(1, reversedArray()))
fun UInt256.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(UInt256::class))