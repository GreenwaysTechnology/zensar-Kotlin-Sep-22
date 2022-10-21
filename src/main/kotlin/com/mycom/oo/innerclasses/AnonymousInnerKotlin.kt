package com.mycom.oo.innerclasses

class Message {
    object Waring {
        var WaringMessage = "Warning"
    }
}

fun main() {
    Message.Waring.WaringMessage = "new Message"
    println(Message.Waring.WaringMessage)
}