package bbl.solution


sealed class Option {
    class Some<T>(val objet: T) : bbl.solution.Option()
    object None : bbl.solution.Option()

}


fun main(args: Array<String>) {
    val something: bbl.solution.Option = bbl.solution.Option.Some("hello")


    val str = when(something){
        is bbl.solution.Option.Some<*> -> {
            something.objet.toString()
        }
        is bbl.solution.Option.None -> {
            "none !"
        }
    }

    println(str)
}