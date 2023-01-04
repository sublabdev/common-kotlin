package dev.sublab.common.numerics

fun UInt8.toByteArray() = byteArrayOf(toByte())
fun ByteArray.toUByte() = first().toUByte()
fun ByteArray.toUInt8() = toUByte()
