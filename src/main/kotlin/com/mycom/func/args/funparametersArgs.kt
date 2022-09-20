package  com.mycom.func.args

fun main() {
    //"Hello" is parameter
    sayHello("Hello")
    //call
    add(1, 2)
    //what if i dont pass parameters
    add();
}

//message is arg
fun sayHello(message: String) {
    println(message)
}

//default args
fun add(a: Int = 0, b: Int = 0) {
    var c = a + b
    println("The Result is $c")
}