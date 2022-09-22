fun main() {
    //you have to pass value
    sayHello("Subramanian")
    sayHello(null)
    sayHello();


}

fun sayHello(firstName: String?="") {
    println("Hello ${firstName ?: ""} and its length is ${firstName?.length ?: 0}")
}