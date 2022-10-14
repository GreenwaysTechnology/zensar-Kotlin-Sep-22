package com.mycom.oo.hierachy.hasa


class Address(var street: String = "street", var city: String = "city") {

}

//has-a
class Employee(var id: Int = 0, var name: String = "name", var address: Address = Address()) {

}

fun main() {
    var emp = Employee(id = 10, name = "Subramanian", address = Address(street = "10th street", city = "Coimbatore"));
    println(emp.id)
    println(emp.name)
    println(emp.address.street + emp.address.city)
}