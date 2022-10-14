package com.mycom.oo.hierachy.isa.interfaces

//java styles
interface Greeter {
    fun greet(): Unit
}

//class GreeterImpl : Greeter {
//    override fun greet() {
//        println("Greet")
//    }
//}

//Kotlin Style

fun interface Hello {
    //single abstract method
    fun sayHello(): Unit
}

//
fun interface Predicate {
    fun accept(i: Int): Boolean
}

fun main() {
//    var greet = GreeterImpl()
    //    greet.greet()

    //anonymous implementation
    var greet = object : Greeter {
        override fun greet() {
            println("Greet")
        }
    }
    greet.greet();
    //anonymous implementation
    var hello = object : Hello {
        override fun sayHello(): Unit {
            println("Hello Anonmous pattern")
            //return ""
        }
    }
    hello.sayHello()
    //Lambda expression
    var hello1 = Hello { println("Hello lambda ") }
    hello1.sayHello()
    var isEven = Predicate { it % 2 == 0 }
    print(isEven.accept(3))
}