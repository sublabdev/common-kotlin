package dev.sublab.common.numerics

import java.math.BigInteger

@Suppress("unused")
data class UInt256(val value: BigInteger) {
    companion object {
        const val SIZE_BYTES: Int = 32
    }

    constructor(stringValue: String) : this(BigInteger(stringValue))
}

@Suppress("unused")
fun ByteArray.toUInt256() = UInt256(BigInteger(1, reversedArray()))
fun UInt256.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(UInt256::class))