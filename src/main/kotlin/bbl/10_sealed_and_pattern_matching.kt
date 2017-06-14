package bbl


sealed class Option {
    class Some<T>(val objet: T) : Option()
    object None : Option()

}


fun main(args: Array<String>) {
    val something: Option = Option.Some("hello")


    when(something){
        is Option.Some<*> -> {
            println(something.objet)
        }
        is Option.None -> {
            println("none !")
        }
    }
}