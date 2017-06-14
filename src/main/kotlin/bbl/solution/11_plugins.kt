package bbl.solution



fun String.pluralizeInJava(nb: Int): String {
    if(nb > 1) {
        return this + "s"
    } else {
        return this
    }
}

object CustomFactory {
    fun helloworld(): String {
        return "hello world"
    }
}

fun main(args: Array<String>) {
    for(i in 0..10) {
        println(i)
    }
}


