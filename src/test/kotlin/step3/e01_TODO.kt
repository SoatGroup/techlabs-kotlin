
package step3


import internal.REMPLACE_MOI
import org.junit.Test

class e01_TODO {


    fun reverseString(input: String): String {
        return REMPLACE_MOI("""
Dans la suite du workshop, il vous faudra remplacer les REMPLACE_MOI() par le code
correspondant, pour faire passer les tests.

Essayez tout de suite en remplaçant ce REMPLACE_MOI par la chaine de caractère fourni en entrée, mais dans l'ordre inversée

Kotlin ajoute la fonction reversed sur la class String
""")


    }

    fun interpolate(name: String): String {
        return REMPLACE_MOI(reason = """
Kotlin gère également l'interpolation de chaine de caractère.
Comment faire pour que cette fonction retourne la chaine de caractère 'hello <name>' ?

Pour complexifier tout ça, <name> devra être en minuscule.

Vous pouvez utiliser la concaténation de chaine de caractère. Mais vous passeriez à côté de ce que Kotlin propose !
""")
    }

    @Test
    fun A_reverseString() {
        assert("olleh" == reverseString("hello"))
        assert("dlrow" == reverseString("world"))
        assert("kayak" == reverseString("kayak"))
    }

    @Test
    fun B_interpolate() {
        assert("hello world!" == interpolate("world"))
        assert("hello soat!" == interpolate("soat"))
        assert("hello kotlin!" == interpolate("KotLin"))
    }
}