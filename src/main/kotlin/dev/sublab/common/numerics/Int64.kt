package dev.sublab.common.numerics

fun Int64.toByteArray() = byteRangeForNumeric(Int64::class)
    .map { this shr it }
    .map { it.toByte() }
    .toByteArray()

fun ByteArray.toLong() = foldIndexed(0L) { i, result, byte ->
    result or (byte.toUByte().toLong() shl 8 * i)
}

@Suppress("unused")
fun ByteArray.toInt64() = toLong()