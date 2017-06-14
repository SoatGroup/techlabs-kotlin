package bbl


fun main(args: Array<String>) {
    val (a, b) = listOf("one", "two", "three")

    println(a)
    println(b)

    data class Yop(val a: String,val b: String)

    val yop = Yop("one", "two")
    val (aa, bb) = yop

}
