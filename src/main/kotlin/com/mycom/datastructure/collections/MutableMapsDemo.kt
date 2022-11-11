package com.mycom.datastructure.collections

//mutable map
fun main() {
    mutableMapOf<String, Int>("value1" to 100, "value2" to 200).apply {
        values.forEach(::println)
        keys.forEach(::println)
    }
}