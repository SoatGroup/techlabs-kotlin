package step3

import movies.Commands
import org.junit.Test
import org.junit.Assert


class e02_ExtractCommand {

    @Test
    fun withoutArgs() {
        val (cmd, args) = Commands.fromInput("LIST")
        assert("LIST" == cmd)
        assert("" == args)
    }

    @Test
    fun withArgs() {
        val (cmd, args) = Commands.fromInput("GET 12345")
        assert("GET" == cmd)
        assert("12345" == args)
    }


    @Test
    fun withEmptyArgs() {
        val (cmd, args) = Commands.fromInput("ADD  something")
        assert("ADD" == cmd)
        assert("" == args)
    }


}