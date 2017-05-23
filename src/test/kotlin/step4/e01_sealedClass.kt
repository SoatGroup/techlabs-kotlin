package step4

import org.junit.Assert
import org.junit.Test

sealed class Couleur {
    class Rouge : Couleur()
    class Vert : Couleur()
    class Bleue : Couleur()
}

fun coulorToHex(couleur: Couleur): String {
    return when(couleur) {
        is Couleur.Rouge -> "#FF0000"
        is Couleur.Vert -> "#00FF00"
        is Couleur.Bleue -> "#0000FF"
    }
}

class SealedTest {

    @Test
    fun patternMathing() {
        assert("#FF0000" == coulorToHex(Couleur.Rouge()))
        assert("#00FF00" == coulorToHex(Couleur.Vert()))
        assert("#0000FF" == coulorToHex(Couleur.Bleue()))
    }
}