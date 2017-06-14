package bbl


sealed class Option {
    class Some<T>(val objet: T) : Option()
    object None : Option()

}


fun main(args: Array<String>) {
    val something: Option = Option.Some("hello")


    val str = when(something){
        is Option.Some<*> -> {
            something.objet.toString()
        }
        is Option.None -> {
            "none !"
        }
    }

    println(str)
}