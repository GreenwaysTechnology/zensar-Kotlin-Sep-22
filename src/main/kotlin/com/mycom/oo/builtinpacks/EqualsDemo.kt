package com.mycom.oo.builtinpacks

class Square(val side: Int) {
    //override the equals methods and say that object equality
    override fun equals(other: Any?): Boolean {
        if (other is Square) {
            return other.side == side
        }
        return false;
    }
}

fun main() {
    val square1 = Square(10)
    val square2 = Square(10)
    val isEqual = square1.equals(square2)
    println("Equals method ${isEqual}")

    //equal operator
    var isInstanceEqual =  square1 == square2
    println("Instance Equal using == operator ${isInstanceEqual}")

    var isObjectEquals =  square1 === square2
    println("Instance Equal using === ${isObjectEquals}")


}