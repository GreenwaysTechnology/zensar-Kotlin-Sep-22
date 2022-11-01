package com.mycom.generics

data class Customer(val id: Int = 1, val name: String = "")
data class Employee(val id: Int = 1, val name: String = "")

interface CustomerRepository {
    val isEmpty: Boolean get() = true
    fun store(obj: Customer) {
        //implement code how to store it
    }

    fun getById(id: Int): Customer
}

interface EmployeeRepository {
    val isEmpty: Boolean get() = true
    fun store(obj: Employee) {
        //implement code how to store it
    }

    fun getById(id: Int): Employee
}

class CustomerRepositoryImpl : CustomerRepository {
    override val isEmpty: Boolean
        get() = super.isEmpty

    override fun store(obj: Customer) {
        super.store(obj)
    }

    override fun getById(id: Int): Customer {
        TODO("Not yet implemented")
    }
}

class EmployeeRepositoryImpl : EmployeeRepository {
    override val isEmpty: Boolean
        get() = super.isEmpty

    override fun store(obj: Employee) {
        super.store(obj)
    }

    override fun getById(id: Int): Employee {
        TODO("Not yet implemented")
    }
}
fun main() {
    val customerRepo = CustomerRepositoryImpl()
    println(customerRepo.isEmpty)
    val empRepo = EmployeeRepositoryImpl()
}