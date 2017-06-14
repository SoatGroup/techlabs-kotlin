package bbl.solution


fun ERROR(): Nothing {
    throw RuntimeException()
}

fun main(args: Array<String>) {
    val a: Unit = Unit
    val b: Int = 3
    val c: Any = "hello"
 //   val d: Int = ERROR()


    val aNull: String? = null
    val bNull: Int? = 5


    val bStr: String? = bNull?.toString()
}
