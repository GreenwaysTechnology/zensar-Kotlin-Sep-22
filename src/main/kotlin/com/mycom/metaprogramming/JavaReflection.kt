package com.mycom.metaprogramming

import java.lang.reflect.Type

class Transaction(val id: Int, val amount: Double, var description: String = "Default Value") {
    fun valdiate() {
        if (amount > 10000) {
            println("Transaction is too large")
        }
    }
}

fun intertospectInstance(obj: Any) {
    println("Class ${obj.javaClass.simpleName}")
    println("properties \n ")
    obj.javaClass.declaredFields.forEach { println(" name ${it.name} ${it.type.simpleName}") }
    println("Functions \n")
    obj.javaClass.declaredMethods.forEach {
        println("${it.name} ${it.returnType.simpleName}")
    }
}
fun getType(obj:Type){
    println(obj.typeName)
}

fun main() {
    intertospectInstance(Transaction(1, 200.00, "A simple Transaction"))
    getType(Transaction::class.java)
}