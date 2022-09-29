package com.mycom.oo

fun main() {
    //here customer is variable points the instance , called as reference variable
    //var is keyword
    //:Customer is type - custom Type /Abstract type
    //Customer() - constructor call which indicates memory allocation
    //In kotlin no new keyword, provided by the compiler
//    var customer:Customer = Customer() //with explcity
    var customer = Customer() //with Type inference
    //property initalization
    customer.customerId = 1
    customer.firstName = "Subramanian"
    customer.lastName = "Murugan"
    customer.city = "Coimbatore"
    customer.balance = 19887.00
    //access property
    println("Id ${customer.customerId}")
    println("Name ${customer.firstName} ${customer.lastName}")
    println("City ${customer.city}")
    println("Balance ${customer.balance}")

}