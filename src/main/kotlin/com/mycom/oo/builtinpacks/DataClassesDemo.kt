package com.mycom.oo.builtinpacks

data class User(val name: String, val age: Int)

fun main() {
    var user = User("Subramanian", 18);
    println(user.toString())
    println(user.hashCode())
    //cloning objecj
    var newUser = user.copy(age = 41)
    println("${newUser.name} ${newUser.age}")

}