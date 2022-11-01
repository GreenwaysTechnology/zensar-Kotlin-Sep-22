package com.mycom.generics.constraints

import java.io.Serializable

open class Entity(val id: Int = 0)
class CustomerEntity : Entity(), Serializable

//Single Restriction The class has only Entity Restrictions
//here T is Type of "Any?"
class Repository<T : Entity> {
    fun save(entity: T) {
        //biz logic
        if (entity.id != 0) {
            //do something
        }
    }
}

//multiple Restrictions
class GenericRepository<T> where T : Entity, T : Serializable {
    fun save(entity: T) {
        if (entity.id != 0) {
            //do something
        }
    }
}


fun main() {
    val repo = Repository<CustomerEntity>()
    repo.save(CustomerEntity())

    val multi = GenericRepository<CustomerEntity>()
}