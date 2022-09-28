package com.mycom.functionalprogramming.lambdas

import kotlin.concurrent.thread

fun delay(action: () -> Unit) {
    action()
}

fun compute(no: Int = 0, action: () -> Unit) {
    println("no ${no}")
    action()
}

fun filterBy(order: String = "asc", name: String = "name", no: Int = 0, action: () -> Unit) {
    println("Order ${order} Name ${name} no ${no} ")
    action()
}

fun main() {

    //passing regular function as parameter
    delay(fun() {
        println("delay")
    })
    //passing lambda
    var task = {
        println("Task")
    }
    delay(task)
    //passing lambda as literal directly
    delay({
        println("Task is more")
    })

    //lambda skips ()
    delay {
        println("DSL task")
    }
    //regular syntax
    compute(10, { println("Compute") })

    //dsl syntax
    compute(10) { println("Compute WITH DSL") }

    filterBy(order = "desc", name = "John", no = 100) {
        println("Filter is done")
    }

    //built in function called
    thread(name = "My Sweet Thread", start = true) {
        println(" Current Thread ${Thread.currentThread().name}")
    }
    thread(name = "Product Thread", start = true) {
        //Thread.sleep(1000)
        println(" Current Thread ${Thread.currentThread().name}")
    }
    //can we pass lambda first parameter

    filterBy(action = { println("filter is over ") }, name = "Product")
}