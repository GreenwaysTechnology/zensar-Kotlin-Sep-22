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
    //way 2 : solution 2 : using safe navigation operator
    println(firstName?.length)
    println("Hello")

    //way 3: solution 3: : using Elvis Operator :  if there is null, if you access property
    //on null, it gives you null as output, if you want some meaningfull default values we can use
    //Elvis operator

    var length = firstName?.length ?: 0
    println("String length is $length")

    //way 4: solution 4: For some other reason, if you want "Runtime Exception", how to throw runtime
    //Exception
    println("Boom! ${firstName!!.length}")

}