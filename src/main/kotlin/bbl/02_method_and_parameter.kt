package bbl



fun add(a: Int = 0, b: Int = 0): Int {
    return a + b
}
fun main(args: Array<String>) {
    println("add = ${add(5, 3)}")
    println("add = ${add(a = 6, b = 5)}")
    println("add = ${add(a = 3)}")
}