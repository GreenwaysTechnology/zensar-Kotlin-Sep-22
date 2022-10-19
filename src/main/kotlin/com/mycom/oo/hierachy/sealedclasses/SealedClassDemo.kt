package com.mycom.oo.hierachy.sealedclasses


sealed class MyResult {
    //inner classes
    data class Success(val resolve: String) : MyResult()
    data class Failure(var reject: String) : MyResult()
    class Loader() : MyResult()
}

fun getSuccess(): MyResult {
    return MyResult.Success("Success")
}

fun getFailure(): MyResult {
    return MyResult.Failure("Reject")
}

fun getResponse(): MyResult {
    val status = 200
    if (status == 200) return MyResult.Success("Response Found")
    return MyResult.Failure("Response Not Found")
}

fun main() {
    //var result = Result()
//    var result = MyResult.Success("Success")
//    println(result.resolve)

    var success = getSuccess()
    when (success) {
        is MyResult.Success -> {
            println(success.resolve)
        }
        is MyResult.Failure -> {
            println(success.reject)
        }
        else -> {
            println("Loading")
        }
    }
    var failure = getFailure();
    when (failure) {
        is MyResult.Success -> {
            println(failure.resolve)
        }
        is MyResult.Failure -> {
            println(failure.reject)
        }
        else -> {
            print("Data is loading")
        }
    }

    var response = getResponse()
    when (response) {
        is MyResult.Success -> {
            println(response)
        }
        is MyResult.Failure -> {
            println(response.reject)
        }
        else -> {
            print("Data is loading")
        }
    }
}