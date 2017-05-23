package movies

sealed class Option {
    class Some(val value: String) : Option()
    object None : Option()
}

fun toStr(opt: Option): String  = when(opt) {
    is Option.Some -> opt.value
    Option.None -> "nope"
}

fun main(args: Array<String>) {

    println(toStr(Option.Some("kkkk")))
    println(toStr(Option.None))

}