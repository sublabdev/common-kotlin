package dev.sublab.sugar

fun <T> T?.or(defaultValue: T) = this ?: defaultValue
fun String?.orEmpty() = or("")