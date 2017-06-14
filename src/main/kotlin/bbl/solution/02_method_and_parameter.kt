package bbl.solution



fun add(a: Int = 0, b: Int = 0): Int {
    return a + b
}
fun main(args: Array<String>) {
    println("add = ${bbl.solution.add(5, 3)}")
    println("add = ${bbl.solution.add(a = 6, b = 5)}")
    println("add = ${bbl.solution.add(a = 3)}")
}