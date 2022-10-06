package com.mycom.oo

fun main() {
    val user = User()
    user.name = "subu"
    user.age =19

    user.firstName ="Subramanian"
    user.lastName ="Murugan"

    println(user.name)
    println("Full Name ${user.fullName}")
    println(user.age)

}