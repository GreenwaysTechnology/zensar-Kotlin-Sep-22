package com.mycom.generics.variance

import java.util.Objects

open class Person

//Employee is SubType of Person
class Employee : Person()

//function which populates the objects
fun operate(person: Person) {
    //some logic to operate on instances
}

class Box<T> {
    fun add(n: T) {
        //some code
    }
}

//container object
class MyArray<T> {
    public constructor(obj: T) {
        println(obj)
    }
}

fun operateV2(person: MyArray<Person>) {

}


fun main() {
    //program to Super Type
    val person: Person = Person()
    operate(person) // valid
    val employee: Employee = Employee()
    operate(employee)
    //
    val box = Box<Number>()
    val x: Int = 10
    box.add(x)
    val y: Double = 10.89
    box.add(y)

    operateV2(MyArray<Person>(person))
    operateV2(MyArray<Person>(employee))
    val str: List<String> = ArrayList<String>()
    val obj: List<Any> = str;

}