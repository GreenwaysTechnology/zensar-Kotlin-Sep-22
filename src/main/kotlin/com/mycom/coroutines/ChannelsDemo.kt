package com.mycom.coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        //create a channel
        val channel = Channel<Int>()
        //send data async
        launch(Dispatchers.Default) {
            //publish data inside one coroutine
            println("Publishing in ${Thread.currentThread().name}")
            for(i in 10 downTo 0) channel.send(i)
        }
        launch(Dispatchers.IO) {
            //recevie data inside another coroutine
            println("Receiving ${Thread.currentThread().name}")
            for (j in channel) println("downloading $j")
        }
    }
}