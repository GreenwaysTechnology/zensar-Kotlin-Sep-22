package com.mycom.oo.builtinpacks

class Employee {
    override fun hashCode(): Int {
        return 100*100
    }
}


fun main() {
    var employee = Employee()
    print(employee.hashCode())
}