package com.mycom.functionalprogramming.lambdas

//normal function
fun add(a: Int = 1, b: Int = 1): Int {
    return a + b
}

//function expression:if function has only one line of returned code.
fun addExpression(a: Int = 1, b: Int = 1) = a + b

//function as literal : function can be assigned into a variable
var addFun = fun(a: Int, b: Int): Int {
    return a + b
}

//function as lambda : function can be assigned into a variable
var addLambda = { a: Int, b: Int ->
    //body of the fun expression
    //return a + b //return keyword is not used
    a + b
}

fun main() {
    println(add(10, 10))
    println(addExpression(10, 10))
    println(addFun(10, 10))
    println(addLambda(10,10))
}