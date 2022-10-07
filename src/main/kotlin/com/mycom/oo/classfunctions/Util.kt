package com.mycom.oo.classfunctions

class Util {

    //normal function
    fun sayHai(): Unit {
        println("Hai")
    }

    //literal function declaration
    var sayHello: () -> Unit = fun() {
        println("Hello")
    }

    //higher order function
    fun login(userName: String = "", password: String = "", resolve: (String) -> Unit, reject: (String) -> Unit) {
        //biz logic
        if (userName == "admin" && password == "admin")
            resolve("Login Success")
        else
            reject("Login failed")
    }

    //lambda expression
    var addLambda = { a: Int, b: Int ->
        //body of the fun expression
        //return a + b //return keyword is not used
        a + b
    }

    //higher order lambdas
    fun delay(action: () -> Unit) {
        action()
    }
    //higher order lambda: passing lambda as parameter to another lambda
    var async = { action: (String) -> Unit ->
        action("async function")
    }
}