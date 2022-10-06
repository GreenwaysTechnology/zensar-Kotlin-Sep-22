package com.mycom.oo

class Employee {
    //property initialization - inside class directly
    //var employeeId: Int? = 0
    var employeeId: Int?

    //init block
    init {
        println("init block -1")
        employeeId = 0
    }

    init {
        println("init block-2 ")
    }

    init {
        println("init block 3")
    }
}