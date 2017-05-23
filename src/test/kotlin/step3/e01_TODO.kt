package step3

import internal.REMPLACE_MOI
import org.junit.Assert
import org.junit.Test

class e01_TODO {


    fun reverseString(input: String): String {
        return input.reversed()
    }

    fun interpolate(name: String): String {
        return "hello ${name.toLowerCase()}!"
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