package com.example.bletutorial.util

/**
 * Convert little endian to Int
 * */
fun ByteArray.toInt(): Int {
    var result = 0
    for (i in this.indices) {
        result = result or (this[i].toInt() shl 8 * i)
    }
    return result
}