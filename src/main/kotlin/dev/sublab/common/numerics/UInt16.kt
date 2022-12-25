package dev.sublab.common.numerics

fun UInt16.toByteArray() = byteRangeForNumeric(UInt16::class)
    .map { toUInt() shr it }
    .map { it.toByte() }
    .toByteArray()

fun ByteArray.toUShort() = foldIndexed(0U) { i, result, byte ->
    result or (byte.toUByte().toUInt() shl 8 * i)
}.toUShort()

@Suppress("unused")
fun ByteArray.toUInt16() = toUShort()