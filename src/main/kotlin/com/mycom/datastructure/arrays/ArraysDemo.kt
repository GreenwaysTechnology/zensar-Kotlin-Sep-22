package com.mycom.datastructure.arrays

fun main() {
    //int array
    //factory function with type
    var myIntArray: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    println(myIntArray.get(0))
    myIntArray.iterator().forEach { println(it) }

    //constructor
    var strArray = Array(3, { i -> "hello ${i}" })
    strArray.iterator().forEach { println(it) }

    //generic function
    val courses = arrayOf<String>("Kotlin", "Java", "scala", "Groovy")
    courses.iterator().forEach { println(it) }
}