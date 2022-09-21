package com.mycom.func.returns


fun main() {
    var message = sayHello()
    println(message)
    println(add(10, 10))
    doStuff()
    doStuffOne()
}

fun sayHello(): String {
    return "Hello"
}

fun add(a: Int = 0, b: Int = 0): Int {
    return a + b
}

//not return any value
fun doStuff():Unit {
    println("do Stuff")
   // return ; return statement is optional
}

fun doStuffOne() {
    println("do Stuff")
    // return ; return statement is optional
}