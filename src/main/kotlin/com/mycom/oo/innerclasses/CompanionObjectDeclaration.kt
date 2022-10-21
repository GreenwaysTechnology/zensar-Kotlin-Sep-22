package com.mycom.oo.innerclasses

//class Greetings {
//    object Factory {
//        fun createInstance():Greetings = Greetings()
//    }
//}
//class Greetings {
//    companion object Factory {
//        fun createInstance(): Greetings = Greetings()
//    }
//
//    fun sayHello() = "Hello"
//}

interface Factory<T> {
    fun createInstance(): T
}


class Greetings {

    companion object : Factory<Greetings> {
        //fun createInstance(): Greetings = Greetings()
        @JvmStatic
        override fun createInstance(): Greetings = Greetings();
    }

    fun sayHello() = "Hello"
}

fun main() {
    //Greetings.Factory.createInstance()
    val greetings = Greetings.createInstance()
    println(greetings.sayHello())

}