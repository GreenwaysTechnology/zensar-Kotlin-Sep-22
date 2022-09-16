fun main() {
    var a = 10;
    var b = 20
    var max = a
    //traditional style
    if (a < b) {
        max = b
    }
    println("Max $max")
    //kotlin expression style
    if (a < b) max = b //here we return max variable
    println("Max $max")
    //if ..else
    //tradtional style
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("Max $max")
    //expression style
    //here initialize the a value to max variable if condition is true else initialize the b value
    max = if (a < b) a else b
    println("Max $max")

    var isValid = false

    var res = if (isValid) "Greet" else "GoodBye"
    println(res)

    //block of code -logic and return some value

    //Note: we must have else block: which is mandatory
    res = if (isValid) {
        println("More code ")
        var firstName = "Subramanian"
        "welcome $firstName"
    } else {
        var lastName = "Murugan"
        "how are you $lastName"
    }
    println(res)

}