package movies

import internal.REMPLACE_MOI


object AsciiArt {
    fun bar(x: Int): String {
        var result = ""
        for (i in 1..x) {
            result += "-"
        }
        return result
    }

    fun ficheMe(str: String): String {
        var result = "+-${bar(str.length)}-+\n"
        result += "| $str |\n"
        result += "+-${bar(str.length)}-+\n"
        return result
    }
}