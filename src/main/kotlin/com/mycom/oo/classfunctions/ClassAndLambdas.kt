package com.mycom.oo.classfunctions

fun main() {
    var util = Util()
    //normal function
    util.sayHai()
    //literal functions
    util.sayHello()
    //higher order function
    util.login(userName = "admin", password = "admin",
        fun(status) {
            println(status)
        },
        fun(err) {
            println(err)
        })
    //lambda
    println(util.addLambda(10, 10))
    //higher order lambda
    util.delay { println("Task is more") }

    //higher order lambda but passing lambda as parameter
    util.async { println(it) }

}