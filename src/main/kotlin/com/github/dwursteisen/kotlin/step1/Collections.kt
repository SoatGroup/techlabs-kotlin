package com.github.dwursteisen.kotlin.step1

fun main(args: Array<String>) {
    // tag::collection[]
    var immutable = emptyList<String>()
    immutable = immutable + "hello"
    immutable = immutable + "kotlin"
    immutable = immutable +  "!"
    // end::collection[]

    immutable.forEach(::println)

    // tag::mutable[]
    val mutable = mutableListOf("hello")
    mutable.add("kotlin")
    mutable.add("!")
    // end::mutable[]
    mutable.forEach(::println)


    val newList = immutable + mutable

    // tag::map[]
    val map = mapOf(Pair("key", "value"), Pair("otherKey", "value"))
    // end::map[]

    val groupBy = listOf(Pair(1, "value"), Pair(2, "value"), Pair(3, "other"), Pair(4, "stuff"))

    println(groupBy.groupBy({ it.second }))
    println(groupBy.partition { it.second == "stuff" })
    println(groupBy.associateBy { it.second })
}