package step2

import org.junit.Test

class MutabilityTest {

    @Test fun test1() {
        //Do not change toto initial value
        val toto = 3
        //toto = 5
        assert(toto == 5)
    }

    @Test fun test2() {
        //Try to add an element to the list to make the test pass
        val list = listOf(1, 2, 3, 4)
        assert(list == listOf(1, 2, 3, 4, 5))
    }
}