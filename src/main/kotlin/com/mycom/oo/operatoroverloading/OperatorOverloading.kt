package com.mycom.oo.operatoroverloading

class Person {
    var skills: String? = null
    fun show() = skills
}

//extension function : operator function
operator infix fun Person.plus(person: Person): Person {
    var newPerson = Person()
    newPerson.skills = this.skills + person.skills
    return newPerson
}


fun main() {
    val a: Int = 100
    val b: Int = 200
    //imperative style
    // val c: Int = a + b
    //declarative style :DSL code
    //operator overloaded function
    val c: Int = a.plus(b)

    println("The result is $c")

    var person1 = Person()
    person1.skills = "Kotlin"
    println(person1.show())

    var person2 = Person()
    person2.skills = "Mobile Development"
    println(person2.show())

    //coimbine two person skills via operator :

    //var newSkill = person1.plus(person2)
//    var newSkill = person1 + person2
    var newSkill = person1 plus person2

    newSkill.apply {
        println(skills)
    }


}