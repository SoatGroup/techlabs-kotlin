package step2

import org.junit.Assert
import org.junit.Test

class Destructuring {

    @Test
    fun string_destrucruting() {
        val (first, second) = "hello world".split(" ")
        assert("hello" == first)
        assert("world" == second)
    }

    @Test
    fun array_destructuring() {
        val elts = arrayOf(1, 2, 3, 4)

        val (first, second) = elts
        assert(1 == first)
        assert(2 == second)

    }

    @Test
    fun dataclass_destructuring() {
        data class Personne(val nom: String, val prenom: String, val ville: String)

        val data = Personne("Doe", "John", "Paris")

        val (nom, prenom, ville) = data
        assert("Doe" == nom)
        assert("John" == prenom)
        assert("Paris" == ville)
    }


}