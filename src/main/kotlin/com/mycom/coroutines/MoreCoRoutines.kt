package com.mycom.coroutines


import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread


fun main() {
    runBlocking {
       val job1 = GlobalScope.launch {
           println("Coroutine-1 Thread ${Thread.currentThread().name}")
            delay(5000)
            println("*")
        }
        job1.join()

        val job2 = GlobalScope.launch {
            println("Coroutine-2 Thread ${Thread.currentThread().name}")
            delay(5000)
            println("*")
        }
        job2.join()

    }

}