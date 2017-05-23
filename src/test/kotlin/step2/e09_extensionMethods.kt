package step2

import internal.REMPLACE_MOI
import org.junit.Assert
import org.junit.Test
import java.time.Duration

/**
 *  Documentation associé : "Extensions" dans kotlin-docs.pdf
 */
data class Color(val r: Int, val g: Int, val b: Int)


class ExtensionMethods {

    @Test
    fun extendMethods() {
        //val red = "#FF0000".toColor()
        val red: Color = REMPLACE_MOI("A partir d'une chaine d'une couleur Hexadecimal," +
                " convertisez la chaine de caractère en object couleur.(exemple ci dessus)")
        assert(255 == red.r)
        assert(0 == red.g)
        assert(0 == red.b)
    }

    @Test
    fun extendProperties() {
//        val duration = 1.second
        val duration: Duration = REMPLACE_MOI("En utilisant l'expression 1.second, convertissez cet entier en object Duration")
        assert(Duration.ofSeconds(1L) == duration)
    }
}