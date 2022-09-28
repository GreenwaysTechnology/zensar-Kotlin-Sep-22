package com.mycom.functionalprogramming.lambdas


fun doubleIt(n: Int = 0, action: (Int) -> Unit) {
    //double the input and send the result via lambda
    action(n * 2)
}

fun add(a: Int = 0, b: Int = 0, c: Int = 0, action: (Int) -> Unit) {
    action(a + b + c)
}

//return values from the lambda
fun multiply(a: Int = 0, b: Int = 0, action: (Int) -> Int) {
    var result = action(a * b)
    println("Returned Result from the Calleer $result")
}

fun main() {
    doubleIt(10) { res -> println("Result is $res") }
    doubleIt(10) { println("Result is $it") }
    add(a = 10, b = 30, c = 80) { println("Result is $it") }

    //return value from the lambda, no return statement , last line of lambda is return
    multiply(a = 10, b = 10) { res ->
        println("Multiply function")
        res
    }
    //refactor the code with it
    multiply(a = 10, b = 10) {
        println("Multiply function")
        it
    }

}