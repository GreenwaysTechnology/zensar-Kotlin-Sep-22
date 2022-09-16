fun main() {
    //range
    for (count in 1..4) {
        println("Count $count")
    }
    //reverse order
    for (count in 5 downTo 1) {
        println("Counter downwards ${count}")
    }
    //step by
    for (count in 1..100 step 2) println(count)
    for (count in 100 downTo 100 step 2) println(count)

    //until
    println("until")
    for (count in 5 until 10) println(count)

    //while loops
    var x = 1
    while (x <= 10) {
        println("x $x")
        x++
    }

}