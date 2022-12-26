package dev.sublab.common.numerics

import java.math.BigInteger

@Suppress("unused")
data class UInt256(val value: BigInteger) {
    companion object {
        const val SIZE_BYTES: Int = 32
    }

    constructor(stringValue: String) : this(BigInteger(stringValue))
    constructor(uint8Value: UInt8) : this(uint8Value.toUInt())
    constructor(uint16Value: UInt16) : this(uint16Value.toUInt())
    constructor(uint32Value: UInt32) : this(BigInteger.valueOf(uint32Value.toLong()))
    constructor(uint64Value: UInt64) : this(BigInteger.valueOf(uint64Value.toLong()))
    constructor(uint128Value: UInt128) : this(uint128Value.value)
}

@Suppress("unused")
fun ByteArray.toUInt256() = UInt256(BigInteger(1, reversedArray()))
fun UInt256.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(UInt256::class))


@Suppress("unused")
fun UInt8.toUInt256() = UInt512(this)
@Suppress("unused")
fun UInt16.toUInt256() = UInt512(this)
@Suppress("unused")
fun UInt32.toUInt256() = UInt512(this)
@Suppress("unused")
fun UInt64.toUInt256() = UInt512(this)
@Suppress("unused")
fun UInt128.toUInt256() = UInt512(this)