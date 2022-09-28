package com.mycom.functionalprogramming.lambdas

//function as lambda : function can be assigned into a variable
var add = { a: Int, b: Int ->
    a + b
}

//mulitple line of code
//with type
var login: (String, String) -> String = { userName: String, password: String ->
    println("Login function is called")
    println("$userName $password")
    if (userName == "admin" && password == "admin")
        "Login Success"
    else
        "Login Failed"

}

//without type: Type inference:Highly recommend
//var auth = { userName: String, password: String ->
//    println("Login function is called")
//    println("$userName $password")
//    if (userName == "admin" && password == "admin")
//        "Login Success"
//    else
//        "Login Failed"
//
//}
var auth = { userName: String, password: String ->
    println("Login function is called")
    println("$userName $password")
    if (userName == "admin" && password == "admin")
        "Login Success"
    else
        "Login Failed"

}

//lambdas has no parameter and no return value
//var myFun: () -> Unit = {
//    println("Hello")
//    println("How are you?")
//    println("What about you")
//}
var myFun = {
    println("Hello")
    println("How are you?")
    println("What about you")
}

/////////////if lambda has single arg and parameter
var sayMyName = { name: String ->
    name.uppercase()
}

//name variable can be replaced with "it" variable
var sayYourName: (String) -> String = { it.uppercase() }

fun main() {
    println(add(10, 10))
    println(login("admin", "admin"))
    myFun()
    println(sayMyName("Subramnaian"))
    println(sayYourName("Subramnaian"))


}