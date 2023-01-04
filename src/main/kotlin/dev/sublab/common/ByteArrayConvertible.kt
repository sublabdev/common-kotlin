package dev.sublab.common

interface ByteArrayConvertible {
    fun toByteArray(): ByteArray
}

@Suppress("unused")
fun String.asByteArrayConvertible() = object : ByteArrayConvertible {
    override fun toByteArray() = this@asByteArrayConvertible.toByteArray()
}

@Suppress("unused")
fun ByteArray.asByteArrayConvertible() = object : ByteArrayConvertible {
    override fun toByteArray() = this@asByteArrayConvertible
}

abstract class FromByteArray(byteArray: ByteArray): ByteArrayConvertible