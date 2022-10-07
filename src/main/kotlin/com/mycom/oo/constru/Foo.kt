package com.mycom.oo.constru

class Foo constructor() {
    //secondary constructors
    //invoke always primary constructor
    constructor(a: String) : this() {
        println("Constructor with String arg")
    }
    constructor(b: Int) : this() {
        println("Constructor with Int  arg")
    }
    constructor(a:Int,b:Int):this(){
        println("Constructor with Int, Int arg")
    }
}