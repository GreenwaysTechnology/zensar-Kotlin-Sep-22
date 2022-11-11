package com.mycom.coroutines

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        val result: Deferred<String> = async {
            println("Hello async")
            delay(1000L)
            //return value: value can be any type
            "Hello,How are you?"
        }
        //get value
        result.join()
        println("Value Got From the Coroutine ${result.await()}")
    }
}