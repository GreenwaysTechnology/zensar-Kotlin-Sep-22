package com.mycom.oo.builtinpacks

data class Person(var id: Int, var name: String, var city: String) {

}


fun main() {
    var person = Person(id = 1, name = "Subramanian", city = "Coimbatore")
    println("Without Destructuring")
    println("${person.id} ${person.name} ${person.city}")
    println("With Destructuring")
    var newPerson = Person(id = 1, name = "Subramanian", city = "Coimbatore")
    var (id, name, city) = newPerson
    println("${id} ${name} ${city}")


}