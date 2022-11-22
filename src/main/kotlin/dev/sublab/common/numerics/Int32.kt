package dev.sublab.common.numerics

fun Int32.toByteArray() = byteRangeForNumeric(Int32::class)
    .map { this shr it }
    .map { it.toByte() }
    .toByteArray()

fun ByteArray.toInt() = foldIndexed(0) { i, result, byte ->
    result or (byte.toUByte().toInt() shl 8 * i)
}

fun ByteArray.toInt32() = toInt()