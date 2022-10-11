package com.mycom.oo.dynamicprogramming

inline  fun mulitpleOf(no: Int, multipleOf: Int): Boolean {
    return no % multipleOf == 0
}

fun ArrayList<Int>.filterOnCondition(condition: (Int) -> Boolean): ArrayList<Int> {
    var result = arrayListOf<Int>()
    for (item in this) {
        if (condition(item)) {
            result.add(item)
        }
    }
    return result
}

fun main() {
    var list = arrayListOf<Int>()
    for (n in 1..1000) {
        list.add(n)
    }
    //passing function as parameter:
    var result = list.filterOnCondition { mulitpleOf(it, 5) }
    println(result)

}