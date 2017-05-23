package step3

import movies.AsciiArt
import org.junit.Assert
import org.junit.Test

class e04_AsciiArt {
    @Test
    fun afficheBar() {
        assert("" == AsciiArt.bar(0))
        assert("-" == AsciiArt.bar(1))
        assert("-----" == AsciiArt.bar(5))
        assert("--------" == AsciiArt.bar(8))
    }

    @Test
    fun afficheFiche() {
        Assert.assertEquals(
"""+-------------+
| hello world |
+-------------+
""",
        AsciiArt.ficheMe("hello world")
        )
    }

}
