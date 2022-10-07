package com.mycom.oo.classfunctions

fun main(){
    var employeeService = EmployeeService()
    println (employeeService.findAll())
    println(employeeService.save("foo"))
    println(employeeService.remove(10))
}