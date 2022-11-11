package com.mycom.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull

fun main() {
    runBlocking {
//        withTimeout(1500L) {
//            //CODE should execute within 1500
//            repeat(1000){
//                println("i $it")
//                delay(500)
//            }
//        }
        val result = withTimeoutOrNull(1500L) {
            repeat(1000) {
                println("i $it")
                delay(500)
            }
        }
        println("Result is $result")
    }
}