package step2

import internal.REMPLACE_MOI
import org.junit.Test


class HelloWorldTest {
    private fun helloWorld() {
        REMPLACE_MOI("Cette méthode doit retourner la chaine de caractère 'hello kotlin'." +
                "Mais Comment faire ?")
    }

    @Test fun test() {
        REMPLACE_MOI("Supprimez le commentaire ci dessous")
        // assert(helloWorld() == "hello kotlin !!")
    }
}