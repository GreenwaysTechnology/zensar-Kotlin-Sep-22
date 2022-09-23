package com.mycom.functionalprogramming.hof

fun add(a: Int, b: Int) {
    println("$a $b")
}

//Higher order function.
fun sayGreet(action: () -> Unit) {
    action()
    //  action.invoke()
}

fun adder(action: (Int, Int) -> Unit) {
    action(10, 10)//passing value
}

fun main() {
    //passing function as parameter
    var x = 10;
    var y = 20
    add(x, y)//pass variable
    add(10, 10) //pass value- literal
    var sayHello: () -> Unit = fun() {
        println("Hello")
    }
    //function as parameter
    sayGreet(sayHello)
    //function itself passed directly.
    sayGreet(fun() {
        println("Hai")
    })
    adder(fun(a: Int, b: Int): Unit {
        var r = a + b
        println("Result of Adder ${r}")
    })
}