package com.mycom.oo.innerclasses

class Counter {
    init {
        println("Counter [Outer class]")
    }

    //Nested class
    class Increment {
        var i: Int = 1

        init {
            println("Increment [Nested class]")
        }

        fun incrementValue(): Int {
            return i + 1;
        }
    }

    //outer class method
    fun createInner() {
        val inc = Increment()
        println(inc.incrementValue())
    }
}

fun main() {
    val counter = Counter()
    val inner = counter.createInner()
    //syntax 2
    val newCounter = Counter.Increment()
    println(newCounter.incrementValue())
    //short cut
    println(Counter.Increment().incrementValue())
}