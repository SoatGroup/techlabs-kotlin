package step2

import internal.REMPLACE_MOI
import org.junit.Assert
import org.junit.Test

/**
 *  Documentation associé : "Properties and Fields" dans kotlin-docs.pdf
 */
class Properties {


    class StringMagicBox {

        val defaultField = "hello world :)"

        val toLower: String = "MINUSCULE !"


        var reversed: String = ""

    }

    @Test
    fun simpleProperties() {
        assert("hello world :)" == StringMagicBox().defaultField)
    }


    @Test
    fun overrideGetter() {
        REMPLACE_MOI("Ajoutez un getter au champ toLower qui retourne le champ, mais en minuscule")
        assert("minuscule !" == StringMagicBox().toLower)

    }


    @Test
    fun overrideSetter() {
        REMPLACE_MOI("Ajoutez un setter au champ reversed qui assigne le champ avec la chaine de caractère mais inversé")
        val stringMagicBox = StringMagicBox()
        stringMagicBox.reversed = "reversed"
        assert("desrever" == stringMagicBox.reversed)
    }


}
