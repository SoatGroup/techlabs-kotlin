package bbl.solution

typealias PlayerId = String



fun display(id: bbl.solution.PlayerId) {
    println(id)
}


fun main(args: Array<String>) {
    val id: bbl.solution.PlayerId = "hello"
    val id2: String = "hello 2"
    bbl.solution.display(id)
    bbl.solution.display(id2)
}