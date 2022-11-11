package com.mycom.coroutines

import kotlin.concurrent.thread

fun delay_() {
    println("Delay task")
    println("Delay task is running at  ${Thread.currentThread().name}")

}

fun main() {
    println("Main Program starts ${Thread.currentThread().name}")
    //schedule the task in a separate of execution
   thread(name = "My Thread",) {
       delay_()
   }
}