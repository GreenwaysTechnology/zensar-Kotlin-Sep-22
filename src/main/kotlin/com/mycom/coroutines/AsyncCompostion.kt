package com.mycom.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@OptIn(ExperimentalTime::class)
fun main() {
    runBlocking<Unit> {
        //measure the time taken for execution of all coroutines
        val time = measureTime {
            val task1 = async { getValueOne() }
            val task2 = async { getValueTwo() }
            println("The answer is ${task1.await() + task2.await()}")
        }
        println("Time taken for all tasks is $time")
    }
}

