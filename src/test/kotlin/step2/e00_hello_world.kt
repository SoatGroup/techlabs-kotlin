package step2

import org.junit.Test


class HelloWorldTest {
    private fun helloWorld(): String {
        return "hello kotlin !!"
    }

    @Test fun test() {
        assert(helloWorld() == "hello kotlin !!")
    }
}