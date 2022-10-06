package com.mycom.oo

fun main(){
    var employee = Employee()

    println("Id ${employee.employeeId}")
    //outside class :
    employee.employeeId =100
    println("Id ${employee.employeeId}")
}