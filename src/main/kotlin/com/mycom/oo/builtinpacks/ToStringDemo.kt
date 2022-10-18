package com.mycom.oo.builtinpacks

class Greeting {
    var name = "Subramanian";

    override fun toString(): String {
        return "name  [$name]";
    }
}

fun main() {
    var greeting = Greeting()
    println(greeting.toString())
}