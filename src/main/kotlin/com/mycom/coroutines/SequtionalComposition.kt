package com.mycom.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@OptIn(ExperimentalTime::class)
fun main() {
    runBlocking<Unit> {
        //measure the time taken for execution of all coroutines
        val time = measureTime {
            val task1 = getValueOne()
            val task2 = getValueTwo()
            println("The answer is ${task1 + task2}")
        }
        println("Time taken for all tasks is $time")
    }
}

suspend fun getValueOne(): Int {
    println("getValue one is called")
    delay(1000)
    return 10
}

suspend fun getValueTwo(): Int {
    println("getValueTwo one is called")

    delay(1000)
    return 20
}