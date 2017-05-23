package step2

import org.junit.Assert
import org.junit.Test


class Properties {


    class StringMagicBox {

        val defaultField = "hello world :)"

        val toLower: String = "MINUSCULE !"
            get() = field.toLowerCase()

        var reversed: String = ""
            set(value) {
                field = value.reversed()
            }
    }

    @Test
    fun simpleProperties() {
        assert("hello world :)" == StringMagicBox().defaultField)
    }


    @Test
    fun overrideGetter() {
        assert("minuscule !" == StringMagicBox().toLower)

    }


    @Test
    fun overrideSetter() {
        val stringMagicBox = StringMagicBox()
        stringMagicBox.reversed = "reversed"
        assert("desrever" == stringMagicBox.reversed)
    }


}
