package bbl


sealed class Option {
    class Some<T>(val objet: T) : bbl.Option()
    object None : bbl.Option()

}


fun main(args: Array<String>) {
    val something: bbl.Option = bbl.Option.Some("hello")


    val str = when(something){
        is bbl.Option.Some<*> -> {
            something.objet.toString()
        }
        is bbl.Option.None -> {
            "none !"
        }
    }

    println(str)
}