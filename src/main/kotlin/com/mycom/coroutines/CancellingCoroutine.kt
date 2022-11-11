package com.mycom.coroutines

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        val job = GlobalScope.launch {
            repeat(1000) {
                println("Job: i am sleeping $it")
                delay(500L)
            }
        }
        delay(1300L)
        println("main: i am tried of waiting!")
//        job.cancel()
//        job.join()
        job.cancelAndJoin()
        println("main : now I can be happy ,good bye")
    }
}