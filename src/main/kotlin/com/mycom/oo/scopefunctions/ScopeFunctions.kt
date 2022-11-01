package com.mycom.oo.scopefunctions

data class User(var name: String, var location: String, var points: Int) {
    fun updateLocation(newLocation: String) {
        location = newLocation
    }

    fun incrementPoints() {
        points++
    }
}

//how to access properties of data class User without scope function
//fun main() {
//    var user = User(name = "Subramanian", location = "Coimbatore", points = 10)
//    //Access the properties of data
//    println("Name ${user.name}")
//    println("location ${user.location}")
//    println("Points ${user.points}")
//    user.updateLocation("Chennai")
//    user.incrementPoints()
//    println("location ${user.location}")
//    println("Points ${user.points}")
//}
/***
 * Function Name says that name of the scope function
 * ObjectReference says that how object properties are accessed inside scope lambda (it,this)
 * Return value says that what is return value of scope functions values could be(object itself(this) or lambda expression)
 *
 * ..................................................................................
 * Function Name    Object Reference   Return Value  isExtension Function
 * ..................................................................................
 * let                  it              Lambda           Yes
 * run                  this            Lambda           yes
 * with                 this            Lambda           No
 * apply                this            Object           Yes
 * also                 it              Object           Yes
 */

fun main() {
    //let
    var res = User(name = "Subramanian", location = "Coimbatore", points = 10).let {
        println("Name ${it.name}")
        println("location ${it.location}")
        println("Points ${it.points}")
        it.updateLocation("Chennai")
        it.incrementPoints()
        println("location ${it.location}")
        println("Points ${it.points}")
        it
    }.let {
        println(it.location)
    }
    println(res)

    //run
    val res1 = User(name = "Murugan", location = "Coimbatore", points = 23).run {
//        println("Name ${this.name}")
//        println("Location ${this.location}")
//        println("Points ${this.points}")
//        this.updateLocation("Chennai")
//        this.incrementPoints()
        println("Name ${name}")
        println("Location ${location}")
        println("Points ${points}")
        updateLocation("Chennai")
        incrementPoints()
        //return curr
        this
    }
    println(res1)
    // var user1 = User(name = "Murugan", location = "Coimbatore", points = 23)
    //with
    //with(user1)
    with(User(name = "Murugan", location = "Coimbatore", points = 23)) {
        println("Name ${this.name}")
        println("Location ${this.location}")
        println("Points ${this.points}")
        this.updateLocation("Chennai")
        this.incrementPoints()
        //return this
        this
    }.let {
        println("Location ${it.location}")
        println("Points ${it.points}")
        it
    }
    //apply
//    var newUser = User(name = "John", location = "Uk", points = 100).apply {
////        this.name = "John Mc"
////        this.location = "Us"
////        this.points = 100
//        name = "John Mc"
//        updateLocation("US")
//        incrementPoints()
//    }

    User(name = "John", location = "Uk", points = 100).apply {
//        this.name = "John Mc"
//        this.location = "Us"
//        this.points = 100
        name = "John Mc"
        updateLocation("US")
        incrementPoints()
    }.let {
        println(it.location)
    }

    //also
    User(name = "James Gosling", location = "USA NY", points = 1000).also {
        //  println(it.name)
        it.updateLocation("USA CA")
        it.incrementPoints()
    }.apply {
        println(name)
        println(location)
        println(points)
    }
    //////////////////////////////////////////////////////////////////////////////////

    with("Subramanian".run {
        uppercase()
        trim()
        this
    }) {
        println(this.length)
    }


}