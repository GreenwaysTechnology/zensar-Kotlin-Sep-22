package com.mycom.coroutines

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        val job: Job = GlobalScope.launch {
            //all async task
            println("hello")
            sleep(2000)
            println("world")
        }
        job.join()
        println("greet")
    }
}

