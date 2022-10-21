package com.mycom.oo.innerclasses

class Employee {
    var person = object {
        //variables
        var id = 1
        var firstName = "Subramanian"
        var lastName = "Murugan"

        //methods
        fun getInfo() = "$id $firstName $lastName"
    }

}


fun main() {
    var emp = Employee()
    println(emp.person)
}