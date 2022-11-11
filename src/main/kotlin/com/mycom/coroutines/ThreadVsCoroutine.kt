package com.mycom.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread


fun main() {
    //thread based code
//    repeat(1000000) {
//        thread(name = "mythread") {
//            Thread.sleep(5000)
//            println('*')
//        }
//    }
    runBlocking {
        repeat(100000) {
           val job= GlobalScope.launch {
                delay(5000)
                println("*")
            }
            job.join()

        }

    }

}