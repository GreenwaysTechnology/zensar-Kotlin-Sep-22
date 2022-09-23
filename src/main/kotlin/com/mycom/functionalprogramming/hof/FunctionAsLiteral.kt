package com.mycom.functionalprogramming.hof


fun main() {
    //a is variable
    //10 is value(literal)
    var a: Int = 10 // explicit type is declared
    println("a $a")
    var b = 20 // Type inference is enabled

    //function declaration with Explicit type
    var sayHello: () -> Unit = fun() {
        println("Hello")
    }
    sayHello();

    //function declaration with "type inference"
    var sayHai = fun() {
        println("Hai")
    }
    sayHai()
    //An anonymous function is not allowed to specify default values for its parameters
//    var add: (Int, Int) -> Int = fun(a: Int=0, b: Int=0): Int {
//        return a + b
//    }
    var add: (Int, Int) -> Int = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(add(10, 10));

    var substract = fun(a: Int, b: Int): Int {
        return a - b
    }
    println(substract(10, 4));

    //what if the parameter is nullable
    var accept: ((String) -> String)? = fun(message: String): String {
        return "Hello $message";
    }
    //if function literal is called with nullable, you cant call directly
    //Surrondwith Null Check
    if (accept != null) {
        println(accept("Subramanian"))
    }
    //Every function type is Object, In kotlin every thing is object.

    //there is method called invoke, can be used to invoke any anonymous functions
    println(substract.invoke(10, 23));
    println(accept?.invoke("Geetha Subramanian"))

    //With Type inference
    var display = fun(message: String?): String? {
        return "Hello $message";
    }
    println(display?.invoke("Geetha Subramanian"))

}