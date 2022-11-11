package com.mycom.coroutines

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    runBlocking {
        println("Main Program starts ${Thread.currentThread().name}")
        GlobalScope.launch {
            //all async task
            println("Background threads starts ${Thread.currentThread().name}")
            sleep(2000)
        }
        println("Main Program ends ${Thread.currentThread().name}")
    }
}

suspend fun sleep(timer: Long = 100) {
    delay(timer)
}