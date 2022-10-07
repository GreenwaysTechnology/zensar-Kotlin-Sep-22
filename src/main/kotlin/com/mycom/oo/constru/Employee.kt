package com.mycom.oo.constru


class Employee(var name: String, var age: Int) {
    constructor(age: Int, name: String) : this(name,age) {
        println("some extra code is being executed inside constructor")
    }
}