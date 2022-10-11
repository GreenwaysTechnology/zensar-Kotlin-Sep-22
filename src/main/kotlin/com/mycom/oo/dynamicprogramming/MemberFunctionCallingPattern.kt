package com.mycom.oo.dynamicprogramming

class MyService {
    fun findAll(): String = "findAll"
}

fun main() {
    //using reference variable
    val service = MyService()
    println(service.findAll())
    //using constructors
    println(MyService().findAll())
}
