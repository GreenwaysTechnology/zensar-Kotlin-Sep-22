package com.mycom.oo.hierachy.isa.interfaces

interface Interface1 {
    fun doStuff(): String
    fun foo(){
        println("foo Interface1")
    }
}

interface Interface2 {
    fun doStuff(): String
    fun foo(){
        println("foo Interface2")
    }
}

class Implementator : Interface1, Interface2 {
    override fun doStuff(): String {
        return "Implementor"
    }

    override fun foo() {
        super<Interface2>.foo()
    }
}

fun main() {
    var myvar = Implementator()
    println(myvar.doStuff())
    myvar.foo()

}