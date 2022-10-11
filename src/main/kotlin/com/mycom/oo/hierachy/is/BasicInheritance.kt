package com.mycom.oo.hierachy.`is`


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