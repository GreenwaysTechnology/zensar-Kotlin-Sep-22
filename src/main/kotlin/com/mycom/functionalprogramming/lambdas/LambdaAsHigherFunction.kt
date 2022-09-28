package com.mycom.functionalprogramming.lambdas

//fun delay(action: (String) -> Unit) {
//
//}
//
var async = { payload: String, action: (String) -> Unit ->
    action(payload)
}

fun main() {
    async("My async task is running...") { println(it) }
}