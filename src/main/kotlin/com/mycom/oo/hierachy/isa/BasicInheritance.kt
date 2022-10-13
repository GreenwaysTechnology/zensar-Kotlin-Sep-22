package com.mycom.oo.hierachy.isa


open class Animal {
    init {
        println("Animal class is called")
    }
}

class Dog : Animal() {
    init {
        println("Dog class is called")
    }
}


fun main() {
    var dog = Dog()

}