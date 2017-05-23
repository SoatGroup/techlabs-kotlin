package step2

import org.junit.Assert
import org.junit.Test

class DataClassesTest {

    data class Person(val firstName: String = "Foo", val lastName: String = "Bar")

    @Test
    fun test1() {
        val person = Person()
        assert("Person(firstName=Foo, lastName=Bar)" == person.toString())
    }

    @Test
    fun test2() {
        val person = Person()
        assert(person.copy() == person)
    }

    @Test
    fun test3() {
        val person = Person()
        val copy = person.copy(firstName = "tititi")

        assert(copy.lastName == person.lastName)
        Assert.assertNotEquals(copy.firstName, person.firstName)
    }
}
