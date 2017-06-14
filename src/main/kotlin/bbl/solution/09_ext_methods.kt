package bbl.solution


fun String.pluralize(nb: Int): String {
    if(nb > 1) {
        return this + "s"
    } else {
        return this
    }
}


fun main(args: Array<String>) {
    println("avion".pluralize(1))
    println("avion".pluralize(2))
    println("avion".pluralize(20))
}
