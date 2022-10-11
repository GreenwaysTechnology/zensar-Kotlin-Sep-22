package com.mycom.oo.dynamicprogramming

class MyUtil {
}

//adding new Property outside class
val MyUtil.greetings:String
  get() = "Hello"

fun main() {
    var util = MyUtil()
    println(util.greetings)
}