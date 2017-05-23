package step2

import internal.REMPLACE_MOI
import org.junit.Test


/**
 *  Documentation associé : "Destructuring Declarations" dans kotlin-docs.pdf
 */
class Destructuring {

    @Test
    fun string_destrucruting() {
        REMPLACE_MOI("""Décommentez la ligne ci dessous.
        Remplacez ?? Créez deux variables (first et second) qui seront directement initialisé
à partir du split de la chaine de caractère.""")

        // ?? = "hello world".split(" ")
        // assert("hello" == first)
        // assert("world" == second)
    }

    @Test
    fun array_destructuring() {
        val elts = arrayOf(1, 2, 3, 4)

        REMPLACE_MOI("""Décommentez les lignes ci dessous puis créez deux variables (first et second) directement
        en utilisant les 2 premiers éléments de la liste""")
        // assert(1 == first)
        //assert(2 == second)

    }

    @Test
    fun dataclass_destructuring() {
        data class Personne(val nom: String, val prenom: String, val ville: String)

        val data = Personne("Doe", "John", "Paris")

        REMPLACE_MOI("""Décommentez les lignes ci-dessous puis créé les variables nom, prenom, ville directement à partir de la dataclass""")
//        assert("Doe" == nom)
//        assert("John" == prenom)
//        assert("Paris" == ville)
    }


}