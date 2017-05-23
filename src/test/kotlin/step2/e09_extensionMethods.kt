package step2

import org.junit.Assert
import org.junit.Test
import java.time.Duration


data class Color(val r: Int, val g: Int, val b: Int)

fun String.toColor(): Color {
    val dropFirst = this.drop(1)
    val r = dropFirst.substring(0, 2).toInt(16)
    val g = dropFirst.substring(2, 4).toInt(16)
    val b = dropFirst.substring(4, 6).toInt(16)
    return Color(r, g, b)
}

val Int.seconds: Duration
    get() = Duration.ofSeconds(this.toLong())
val Int.second: Duration
    get() = Duration.ofSeconds(this.toLong())


class ExtensionMethods {

    @Test
    fun extendMethods() {
        val red = "#FF0000".toColor()
        assert(255 == red.r)
        assert(0 == red.g)
        assert(0 == red.b)
    }

    @Test
    fun extendProperties() {
        val duration = 1.seconds

        assert(Duration.ofSeconds(1L) == duration)
    }
}