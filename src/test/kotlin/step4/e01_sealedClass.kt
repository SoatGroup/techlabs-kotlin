package step4

import internal.REMPLACE_MOI
import org.junit.Assert
import org.junit.Test

/**
 *  Documentation associé : "Sealed Classes" dans kotlin-docs.pdf
 */
sealed class Couleur {
    class Rouge : Couleur()
    class Vert : Couleur()
    class Bleue : Couleur()
}

fun couleurToHex(couleur: Couleur): String {
   REMPLACE_MOI("""Utilisez l'expression 'when' pour convertir un objet couleur en chaine de caractère hexadecimal.
   Notez que la class Couleur est sealed. Le cas par défaut n'est peut être pas à couvrir alors....""")
}

class SealedTest {

    @Test
    fun patternMathing() {
        assert("#FF0000" == couleurToHex(Couleur.Rouge()))
        assert("#00FF00" == couleurToHex(Couleur.Vert()))
        assert("#0000FF" == couleurToHex(Couleur.Bleue()))
    }
}