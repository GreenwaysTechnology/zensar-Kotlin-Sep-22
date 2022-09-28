package com.mycom.functionalprogramming.hof

//how to pass more fun parameters
fun login(userName: String = "", password: String = "", resolve: (String) -> Unit, reject: (String) -> Unit) {
    //biz logic
    if (userName == "admin" && password == "admin")
        resolve("Login Success")
    else
        reject("Login failed")
}

fun main() {
    login(userName = "admin", password = "admin",
        fun(status) {
            println(status)
        },
        fun(err) {
            println(err)
        })
    login(userName = "foo", password = "bar",
        fun(status) {
            println(status)
        },
        fun(err) {
            println(err)
        })
}