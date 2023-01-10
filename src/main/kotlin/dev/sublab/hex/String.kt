package dev.sublab.hex

import java.math.BigInteger

class StringHex(private val string: String) {
    private fun withoutPrefix() = if (string.startsWith("0x")) {
        string.substring(2)
    } else {
        string
    }

    fun decode(): ByteArray {
        val value = withoutPrefix()

        check(value.length % 2 == 0) { "Must have an even length" }

        return value.chunked(2)
            .map { it.toInt(16).toByte() }
            .toByteArray()
    }

    fun toBigInteger() = BigInteger(withoutPrefix(), 16)
}

val String.hex
    get() = StringHex(this)