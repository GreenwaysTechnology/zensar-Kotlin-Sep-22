package com.mycom.oo.dynamicprogramming

class MyClass {
    infix fun sayHello(name: String) {
        println("$this $name")
    }

}

//infix function can be extension function too
infix fun Int.myadd(x: Int) {
    println(this)
    println(x)
}

fun main() {
    //omitting parentheses
    10 myadd 2
    val greeter = MyClass()
    greeter sayHello "Subramanian"

}