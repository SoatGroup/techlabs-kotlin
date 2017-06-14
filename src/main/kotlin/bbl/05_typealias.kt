package bbl

typealias PlayerId = String



fun display(id: PlayerId) {
    println(id)
}


fun main(args: Array<String>) {
    val id: PlayerId = "hello"
    val id2: String = "hello 2"
    display(id)
    display(id2)
}