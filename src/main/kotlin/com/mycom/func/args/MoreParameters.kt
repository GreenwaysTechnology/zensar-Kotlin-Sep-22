fun main() {
    format("Hello", true, false, ',')
    //pass few parameters
    format(str = "Welcome", wordSeparator = ';', normalizeCast = true)
    //if no default args , that is treated as "mandatory parameter"
    //format(wordSeparator = ';', normalizeCast = true)
    format(str = "How are you ?")
    //pass any type of value which is eq to Object o in java.
    accept("Hello")
    accept(100)
    accept(89.45f)
    accept(true)
    accept(3434.89)
    logger("Employee.kt", "Warning", "save method is called")
    logger("Employee.kt", "Error", "remove method throws Error", "402")
}

fun logger(vararg args: String) {
   for (arg in args) println(arg)
}

fun format(
    str: String,
    normalizeCast: Boolean = false,
    upperCaseFirstLetter: Boolean = false,
    wordSeparator: Char = ' '
) {
    println("$str $normalizeCast $upperCaseFirstLetter $wordSeparator")
}

//Object o  = new Employee()
//Object o = 10(new Integer(10)

//how to pass different types of values
fun accept(myVar: Any) {
    println("$myVar")
}
