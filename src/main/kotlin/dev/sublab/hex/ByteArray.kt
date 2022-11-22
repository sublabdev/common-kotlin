package dev.sublab.hex

class ByteArrayHex(private val byteArray: ByteArray) {
    fun encode(includePrefix: Boolean = false): String {
        val encoded = byteArray.joinToString(separator = "") { "%02x".format(it) }
        val prefix = if (includePrefix) "0x" else ""
        return prefix+encoded
    }
}

val ByteArray.hex
    get() = ByteArrayHex(this)