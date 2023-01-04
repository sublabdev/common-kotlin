package dev.sublab.common.numerics

fun Int8.toByteArray() = byteArrayOf(this)
fun ByteArray.toByte() = first()
fun ByteArray.toInt8() = toByte()
