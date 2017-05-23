package com.github.dwursteisen.kotlin.step1

import java.util.*


fun main(args: Array<String>) {

    // constante de type String
    val a: String = "hello"
    // a = "again" ne compilera pas

    // variable de type String
    var b: String = "world"
    b = "again"



    val c:String? = null
    // ne compilera pas car
    // de type String et non String?
    // val c:String = null

    val list1: List<Any> = ArrayList<Any>()
    val list2 = ArrayList<Any>()
    val list3 = emptyList<Any>()

}