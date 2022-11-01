package com.mycom.generics.func

data class Customer(val id: Int = 1, val name: String = "")
data class Employee(val id: Int = 1, val name: String = "")

interface Repository {
    //Generic function
    fun <T> getById(id: Int): T
    fun <E> getAll(): List<E>
}

class RepositoryImp : Repository {
    override fun <E> getAll(): List<E> {
        TODO("Not yet implemented")
    }

    override fun <T> getById(id: Int): T {
        TODO("Not yet implemented")
    }
}

//Generic functions
fun <T> getValue(value: T): T {
    return value;
}

fun main() {
    val repo = RepositoryImp()
    val employees: List<Employee> = repo.getAll<Employee>()
    val customer: Customer = repo.getById<Customer>(3)

    val str: String = getValue<String>("Stringvalue")
    val intValue: Int = getValue<Int>(13)
}