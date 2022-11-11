package com.mycom.datastructure.collections

//transformation
fun transform() {
    //list of numbers
    listOf<Int>(1, 2, 3, 4, 5).let {
        it.forEach(::println)
        it
    }.let {
        //double the elements
        it.map { it * 2 }
    }.let {
        println(".....")
        it.forEach(::println)
    }
}

fun filter() {
    listOf<Int>(10, 34, 2, 3, 5, 78, 9, 0, 1).let {
        it.filter { it % 2 == 0 }
    }.let {
        it.forEach(::println)
    }
}


fun main() {
    //transform()
    filter()
}