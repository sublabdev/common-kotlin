/**
 *
 * Copyright 2023 SUBSTRATE LABORATORY LLC <info@sublab.dev>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

;package dev.sublab.hex

import java.math.BigInteger

class StringHex(private val string: String) {
    private fun withoutPrefix() = if (string.startsWith("0x")) {
        string.substring(2)
    } else {
        string
    }

    /**
     * Returns ByteArray decoded from String
     */
    fun decode(): ByteArray {
        val value = withoutPrefix()

        check(value.length % 2 == 0) { "Must have an even length" }

        return value.chunked(2)
            .map { it.toInt(16).toByte() }
            .toByteArray()
    }

    /**
     * Returns BigInteger from the String
     */
    fun toBigInteger() = BigInteger(withoutPrefix(), 16)
}

/**
 * String converter to ByteArray and BigInteger
 */
val String.hex
    get() = StringHex(this)