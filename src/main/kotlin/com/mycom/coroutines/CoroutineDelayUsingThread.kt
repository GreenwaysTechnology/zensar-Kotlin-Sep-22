package com.mycom.coroutines
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    println("Main Program starts ${Thread.currentThread().name}")
    GlobalScope.launch {
        //all async task
        println("Background threads starts ${Thread.currentThread().name}")
        //delay simulatation
       // Thread.sleep(4000)
        delay(4000)
        println("Background threads ends ${Thread.currentThread().name}")


    }
    println("Main Program ends ${Thread.currentThread().name}")
   // Thread.sleep(5000)
    //delay(100)
}