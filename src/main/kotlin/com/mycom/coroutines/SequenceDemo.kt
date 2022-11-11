package com.mycom.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//Blocking Sequence
//fun main() {
//    getValues().forEach { value -> println(value) }
//}
//
//fun getValues(): Sequence<Int> = sequence {
//    for (i in 1..10) {
//        Thread.sleep(500)
//        yield(i)
//    }
//}

//sequnce in non blocking or async
//fun main() {
//    runBlocking {
//        getValues().forEach { value -> println(value) }
//
//    }
//}
//
//suspend fun getValues():List<Int> {
//   return  listOf(1,2,3,4,5)
//}

//sequence in nonblocking or async with streaming - flow
fun main() {
   runBlocking {
       getValues().collect {value -> println(value) }
   }

}

suspend fun getValues(): Flow<Int> = flow {
    for (i in 1..10) {
        delay(500)
        emit(i)
    }
}
