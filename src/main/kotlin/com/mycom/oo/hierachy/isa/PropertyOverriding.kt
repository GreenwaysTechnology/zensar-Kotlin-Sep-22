package com.mycom.oo.hierachy.isa

open class Shape {
    open val x: Int = 0
}

class Square : Shape() {
    override val x: Int = 10
}

fun main() {
    var shape = Square()
    println(shape.x)
}