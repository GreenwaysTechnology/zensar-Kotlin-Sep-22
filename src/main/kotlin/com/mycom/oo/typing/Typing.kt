package com.mycom.oo.typing

open class Animal {
    open fun eat(): String {
        return "Animal eats"
    }
}

class Dog : Animal() {
    //overriding
    override fun eat(): String {
        return "Dog eats"
    }

    //Dog specific method
    fun bark(): String {
        return "Dog barks"
    }
}

/**
 * during compile time the compiler looks left Side(type) for method expression bindings
 * during runtime time the run time looks right side(Instance) for method invocation -Dynamic
 * method invocation/ Dynamic method dispatch... :Runtime polymorphism
 */
fun main() {
    //here type of animal variable is Dog : Program to concrete type/type
    var animal = Dog();
    println(animal.eat())
    println(animal.bark())
    //super type
    var animal1: Animal = Dog();
    println(animal1.eat())
    //Here this compile error time
    //println(animal1.bark())
    //how to call
    //convert animal type to Dog type
    var tmpDog = animal1 as Dog
    println(tmpDog.bark())

}