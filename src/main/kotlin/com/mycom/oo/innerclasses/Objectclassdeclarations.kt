package com.mycom.oo.innerclasses

//Having Static Modifier
object Product {
    var id = 1
    var name = "Phone"
    fun calculatePrice() = 10
}

fun main() {
//    Product() //objects cant be created out of object class
    println("Product Id ${Product.id}")
    println("Product Name ${Product.name}")
    println("Price ${Product.calculatePrice()}")


}
