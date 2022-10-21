package com.mycom.oo.innerclasses


fun main() {
//Object expression
    var person = object {
        //variables
        var id = 1
        var firstName = "Subramanian"
        var lastName = "Murugan"

        //methods
        fun getInfo() = "$id $firstName $lastName"
    }
    println(person.id)
    println(person.firstName)
    println(person.lastName)
    println(person.getInfo())
}