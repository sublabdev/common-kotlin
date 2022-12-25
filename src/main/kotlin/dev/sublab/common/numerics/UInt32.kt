package dev.sublab.common.numerics

fun UInt32.toByteArray() = byteRangeForNumeric(UInt32::class)
    .map { this shr it }
    .map { it.toByte() }
    .toByteArray()

fun ByteArray.toUInt() = foldIndexed(0U) { i, result, byte ->
    result or (byte.toUByte().toUInt() shl 8 * i)
}

@Suppress("unused")
fun ByteArray.toUInt32() = toUInt()