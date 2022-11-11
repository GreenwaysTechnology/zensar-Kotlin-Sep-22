package com.mycom.datastructure.collections

fun main() {
    var list = mutableListOf<Int>(1, 2, 3)
    list.forEach(::println)
    list.add(4)
    list.add(5)
    list.forEach(::println)

    //scope
    mutableListOf<Int>(1, 2, 3, 4).apply {
        //add selgement
        add(5)
        add(6)
    }.apply {
        println("Before Sorting")
        forEach(::println)
    }.apply {
        sortByDescending { it }
    }.let {
        println("Sorting Desending Order")
        it.forEach(::println)
    }

    //set
    println("Set....")
    mutableSetOf<Int>(1, 2, 3, 4).apply {
        //add selgement
        add(5)
        add(6)
        add(5)
        add(6)
        add(3)
        add(1)
    }.let {
        println("Set Printing")
        it.forEach(::println)
    }
}