//operators
fun main() {
    //arithmetic operators
    var a = 10
    var b = 5
    var c = a + b
    println("Add $c")
    c = a - b
    println("Substract $c")
    c = a * b
    println("Multiplication $c")
    c = a / b
    println("Division $c")
    //augmented operators
    var counter = 1
    counter += 1
    println("Counter $counter")

    //logical operators: works based on boolean expressions
    var isValid = true
    var isEnabled = false
    var res = isValid && isEnabled
    println("Result is $res")
    //comparasional operators

    var x = 100
    var y = 200
    //structural equals
    var isEqual = x == y
    println ("Is Equal $isEqual")
    //reference equal
    var str = "hello"
    var strCp= str // here str and strCp points the same mememory address

    var refEqual = str == strCp
    println("Reference Equal $refEqual")

    //comparsional operators
    var isBig = a >b
    println("Is Big $isBig")

}