package com.mycom.oo.hierachy.enumclasses

import java.time.DayOfWeek

enum class Color {
    RED, BLUE, GREEN
}

enum class Position {
    NORTH, EAST, WEST, SOUTH
}

enum class Day(val day: Int) {
    //enum constants
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7); //semicolon must be declared at end of the enums

    //custom properties
    var dayOfWeek: Int? = 2
    var printableName: String? = "Holiday"

    //custom constructors
    //constructor():this(2)
    //methods
    fun doStuff(): String {
        return "[${dayOfWeek}] -> $printableName"
    }
}

fun main() {
    println("Value ${Color.RED.ordinal} Name ${Color.RED.name}")
    println("Day ${Day.MONDAY.day} ${Day.MONDAY.name}")

    //iterate enums
    for (dateOfWeek in Day.values()) {
        println("[${dateOfWeek.ordinal}] -> ${dateOfWeek.name} (${dateOfWeek.day}) day of the week")
    }

     println("${Day.MONDAY.dayOfWeek} is ${Day.MONDAY.printableName}");

    println("${Day.MONDAY.doStuff()}");


}