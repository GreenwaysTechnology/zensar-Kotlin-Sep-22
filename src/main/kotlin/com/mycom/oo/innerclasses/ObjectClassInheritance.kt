package com.mycom.oo.innerclasses

open class Person {
    open fun calculateAge() = 18
}

object Customer : Person() {
    var name = "Subramanian"
    override fun calculateAge(): Int {
        return super.calculateAge() * 2
    }
}

fun main() {
    println(Customer.name)
    println(Customer.calculateAge())
}