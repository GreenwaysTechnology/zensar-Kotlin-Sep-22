//every kotlin begins with main function
fun main() {
    //invoke function
    sayHello()
    add()
}

//normal function
fun sayHello() {
    //function body
    println("Hello");
    //simulating the current frame,takes much time
    Thread.sleep(10000)
}

fun add() {
    var a = 10
    var b = 20
    var c = a + b
    println("The Result is $c")
}