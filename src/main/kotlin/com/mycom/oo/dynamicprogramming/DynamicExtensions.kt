package com.mycom.oo.dynamicprogramming

//extensions
fun Util.sayHai(): String {
    return "Hai"
}

fun String.add(s1: String, s2: String): String {
    //this refers the method is called on which object
    return this + s1 + s2
}

fun main() {
    var util = Util();
    //calling member function
    println(util.sayHello())
    println(util.sayHai())
    //strings
    var str1: String = "Hello"
    var str2: String = "Hai"
    var str3 = "Hey"
    //str3 is receiver type
    println(str3.add(str1, str2))

}
