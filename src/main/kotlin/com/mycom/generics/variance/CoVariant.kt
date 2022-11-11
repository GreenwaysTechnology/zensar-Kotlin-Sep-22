package com.mycom.generics.variance

interface ReadOnly<out T> {
    fun get(id: Int): T
    fun getAll(): List<T>
}

class ReadOnlyImp<out T> : ReadOnly<T> {
    override fun get(id: Int): T {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<T> {
        TODO("Not yet implemented")
    }
}

fun operate(person: List<Person>) {

}

//co variant : only out
class Producer<out T>(val value: T) {
    fun get(): T {
        return value
    }

//    fun save(value: T) {
//
//    }
}

//contra varient : only in
class Consumer<in T> {
    fun save(value: T): String {
        return value.toString()
    }
}

fun main() {
    operate(listOf(Person()))
    operate(listOf(Employee()))
    println(Producer<String>("Hello").get())
    println(Consumer<String>().save("hi"))
}