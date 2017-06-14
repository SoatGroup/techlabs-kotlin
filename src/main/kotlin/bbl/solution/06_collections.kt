package bbl.solution


fun main(args: Array<String>) {
    val lst = emptyList<String>()
    val lst2 = lst + "something" + "else"

    lst2.filter { str -> str.length > 4 }
            .map { it.toUpperCase() }
            .forEach({ println(it) })

}