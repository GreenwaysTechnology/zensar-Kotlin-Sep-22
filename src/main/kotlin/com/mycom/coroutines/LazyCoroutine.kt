package com.mycom.coroutines

import kotlinx.coroutines.*


import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@OptIn(ExperimentalTime::class)
fun main() {
    runBlocking<Unit> {
        //measure the time taken for execution of all coroutines
        val time = measureTime {
            val task1 = async(start = CoroutineStart.LAZY) { getValueOne() }
            val task2 = async(start = CoroutineStart.LAZY) { getValueTwo() }

            launch {
                delay(5000L)
                task1.start()
                task2.start()
                println("The answer is ${task1.await() + task2.await()}")

            }
        }
        println("Time taken for all tasks is $time")
    }
}

