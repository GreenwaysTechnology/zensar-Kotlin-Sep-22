package com.mycom.generics.cls

data class Customer(val id: Int = 1, val name: String = "")
data class Employee(val id: Int = 1, val name: String = "")

//
interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

//implementation
class GenericRepository<T> : Repository<T> {
    override fun getById(id: Int): T {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<T> {
        TODO("Not yet implemented")
    }
}


fun main() {
    //customers
    val customerRepo = GenericRepository<Customer>()
    val customer: Customer = customerRepo.getById(1)

    val employeeRepo = GenericRepository<Employee>()
    val employee: Employee = employeeRepo.getById(3)
}
