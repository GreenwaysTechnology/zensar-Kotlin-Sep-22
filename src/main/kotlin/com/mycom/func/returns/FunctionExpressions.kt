package com.mycom.func.returns


fun main() {
    println(sum(10, 10))
    println(getValue())
    println(getStock(100))
}

//normal return syntax
//fun sum(a: Int = 0, b: Int = 0): Int {
//    return a * b
//}
//function expression syntax:
//here we can omit curly braces and return statement
//fun sum(a: Int = 0, b: Int = 0): Int = a * b
//even we can omit return type
fun sum(a: Int = 0, b: Int = 0) = a * b

//function returns literals
fun getValue() = 100
//function returns single args
fun getStock(value: Int = 0) = value
