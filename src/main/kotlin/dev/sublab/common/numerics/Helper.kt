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

package dev.sublab.common.numerics

import kotlin.reflect.KClass

internal class InvalidNumericType: Throwable()

internal fun byteSize(type: KClass<*>) = when (type) {
    Byte::class, UByte::class, Int8::class, UInt8::class -> Byte.SIZE_BYTES
    Short::class, UShort::class, Int16::class, UInt16::class -> Short.SIZE_BYTES
    Int::class, UInt::class, Int32::class, UInt32::class -> Int.SIZE_BYTES
    Long::class, ULong::class, Int64::class, UInt64::class -> Long.SIZE_BYTES
    Int128::class, UInt128::class -> 128/8
    Int256::class, UInt256::class -> 256/8
    Int512::class, UInt512::class -> 512/8
    else -> throw InvalidNumericType()
}

@Throws(InvalidNumericType::class)
internal fun byteRangeForNumeric(type: KClass<*>) = (0..((byteSize(type) - 1) * 8) step 8)