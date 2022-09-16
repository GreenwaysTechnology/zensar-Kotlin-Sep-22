fun main() {
    //simple when expression
    var x = 10
    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> println("No Match found")
    }
    //either this or that
    var y = 10
    when (y) {
        0, 10 -> println("Y value is 0 or 1")
        else -> println("other wise")
    }
    //range operator
    var z = 10;
    when (z) {
        in 1..100 -> println("Z is part of this range")
        !in 1..100 -> println("Z is out of Range")
    }
    //return result from the when expression
    var isLoggedIn = false
    var status = when (isLoggedIn) {
        true -> "LoggedIn"
        else -> "Not LoggedIn"
    }
    println(status)
    //when without arg:
    //if no arg is supplied, the branch conditions are simply boolean expression, and a branch
    //executed when its condition is true.

    var num = 3
    var isEvenOrOdd = when {
        num % 2 == 0 -> "Even"
        num % 2 != 0 -> "Odd"
        else -> "No Match Found"
    }
    println(isEvenOrOdd)


}