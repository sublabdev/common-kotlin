package dev.sublab.common.numerics

fun Int16.toByteArray() = byteRangeForNumeric(Int16::class)
    .map { toInt() shr it }
    .map { it.toByte() }
    .toByteArray()

fun ByteArray.toShort() = foldIndexed(0) { i, result, byte ->
    result or (byte.toUByte().toInt() shl 8 * i)
}.toShort()

@Suppress("unused")
fun ByteArray.toInt16() = toShort()