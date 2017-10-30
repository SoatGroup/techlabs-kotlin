package bbl

fun main(args: Array<String>) {
    val something by lazy {
        println("lazy")
        "hell world!"
    }

    println("somethinf")
    println("build -> $something")
}