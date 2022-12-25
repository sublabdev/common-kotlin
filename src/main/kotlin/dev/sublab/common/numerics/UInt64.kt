package dev.sublab.common.numerics

fun UInt64.toByteArray() = byteRangeForNumeric(UInt64::class)
    .map { this shr it }
    .map { it.toByte() }
    .toByteArray()

fun ByteArray.toULong() = foldIndexed(0UL) { i, result, byte ->
    result or (byte.toUByte().toULong() shl 8 * i)
}

@Suppress("unused")
fun ByteArray.toUInt64() = toULong()