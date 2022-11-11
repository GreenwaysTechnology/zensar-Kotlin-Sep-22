package com.mycom.metaprogramming

import kotlin.reflect.full.memberProperties

//declare annotations

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Table(val name: String = "")

//property level annotation
@Target(AnnotationTarget.PROPERTY)
annotation class Field(val name: String)


@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.FUNCTION)
annotation class Greeter

@Table(name = "contactTable")
@Greeter
data class Contact(val id: Int, @Field(name = "Name") val name: String, val email: String)


//@Table()
@Greeter
fun save() {

}

fun main() {
    Contact::class.annotations.find {
        println(it.annotationClass.simpleName)
        it.annotationClass.memberProperties.forEach {
            println(it.name)
        }
        it.annotationClass.simpleName == "Table"
    }


}