package com.mycom.nullrefdemo

fun main() {
    var firstName: String? = null
    //handling null
    //way1 : java style using if
    if (firstName != null) {
        println("FirstName size ${firstName.length}")
    } else {
        println("FirstName variable having null value")
    }
    //way 2 : soution 2 : using safe navigation operator
    println(firstName?.length)
    println("Hello")
}