package com.mycom.functionalprogramming.lambdas

fun login(
    userName: String = "",
    password: String = "",
    resolve: (String) -> Unit,
    reject: (String) -> Unit
) {
    if (userName == "admin") resolve("Login Success") else reject("Login failed")
}

fun doCompute(a: Int = 0, b: Int = 0, action: (Int, Int) -> Unit) {
    action(a, b)
}


fun main() {
    login(userName = "admin",
        password = "admin",
        resolve = { println(it) },
        reject = { println(it) })

    doCompute(a = 10, b = 20) { a, b -> println("$a $b") }
    //how to skip parameters
    doCompute() { a, b -> println("$a $b") }
    //kotlin automatically skips parameters and initialized with default values
    doCompute { a, b -> println("$a $b") }

    //I need here only b value not a value.we can use _ notation
    doCompute { _, b -> println("$b") }
    doCompute(b = 10) { _, b -> println("$b") }


}