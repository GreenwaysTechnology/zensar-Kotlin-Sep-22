package com.mycom.metaprogramming

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}

fun main() {
    //class info
    val classInfo = Transaction::class
    classInfo.memberProperties.forEach {
        println("Property ${it.name} of type ${it.returnType}")
    }
    classInfo.constructors.forEach {
        println("Constructor ${it.name} -  ${it.parameters}")
    }
    // constructor
    val constructor = ::Transaction
    println(constructor)
    //grab information from the constructor function
    println(constructor.parameters.first { it.name == "id" })

    //kotlin classes are instance of KClass<*>
    getKotlinType(Transaction::class)
}