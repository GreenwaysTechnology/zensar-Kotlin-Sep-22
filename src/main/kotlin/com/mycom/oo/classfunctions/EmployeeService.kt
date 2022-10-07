package com.mycom.oo.classfunctions

class EmployeeService {

    //methods or functions
    fun findAll(): String {
        return "findAll"
    }

    fun save(employee: String): Boolean {
        println("$employee is saved")
        return true
    }

    // single expression function
    fun remove(id: Int) = "$id Removed"

}