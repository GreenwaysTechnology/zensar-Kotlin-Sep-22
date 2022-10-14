package com.mycom.oo.hierachy.isa.interfaces

interface Eat {
    fun eat():String
}
interface Walk  {
    fun walk():String
}
class Cat : Eat,Walk {
    override fun eat(): String {
        return "Eat"
    }

    override fun walk(): String {
       return "Walk"
    }
}

fun main(){
    var cat = Cat();
    println(cat.eat())
    println(cat.walk())
}