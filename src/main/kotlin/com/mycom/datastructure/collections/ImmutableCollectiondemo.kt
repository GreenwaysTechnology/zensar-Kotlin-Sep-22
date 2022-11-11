package com.mycom.datastructure.collections

fun main() {
    //immutable collections: readonly collection
    val list: List<String> = listOf<String>("Kotlin", "java", "Groovy", "Scala")
    list.listIterator().forEach { println(it) }
    println("..Set...")
    setOf<String>("Kotlin", "Java", "Groovy", "Scala", "Kotlin", "Java").iterator().forEach {
        println(it)
    }

    listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).let {
        println(it.get(0))
        //method reference operator ::
        it.forEach(::println)
    }

}