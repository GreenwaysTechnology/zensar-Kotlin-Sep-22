package com.mycom.oo.hierachy.isa.interfaces

interface Eatable {
    //open fun eat(): String;
    fun eat(): String;
}

//implmentation
class Dog : Eatable {
    override fun eat(): String {
        return "Dog Eats"
    }

    fun bark(): String {
        return "Bark"
    }
}

class Duck : Eatable {
    override fun eat(): String {
        return "Duck Eats"
    }
    fun swim():String {
        return "swim"
    }
}


fun main() {
    //concrete type
    val dog = Dog()
    println(dog.eat())
    val duck = Duck()
    println(duck.eat())
    //polymorphism : Super type

    var eatableBehaviour: Eatable? = null
    //Dog implmenation
    eatableBehaviour = Dog()
    println(eatableBehaviour.eat())
    //smart casting happens
    println(eatableBehaviour.bark())
    //Duck implmenation
    eatableBehaviour = Duck()
    println(eatableBehaviour.eat())
    println(eatableBehaviour.swim())

}