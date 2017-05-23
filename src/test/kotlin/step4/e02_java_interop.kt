package step4

import java.time.LocalDate
import java.time.format.DateTimeFormatter


object SingletonFromKotlin {
    fun today() = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE)
}


data class DataClassFromKotlin(val name: String, val otherName: String)