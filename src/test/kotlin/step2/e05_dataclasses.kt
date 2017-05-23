package step2

import org.junit.Assert
import org.junit.Test

class DataClassesTest {

    class Person {
        val firstName: String? = null
        val lastName: String? = null

        fun copy(firstname: String? = null): Person {
            throw TODO()
        }
    }

    @Test
    fun test1() {
        val person = Person()
        assert("Person(firstName=Foo, lastName=Bar)" == person.toString())
        TODO("Use a dataclass to implement Person")
    }

    @Test
    fun test2() {
        val person = Person()
        assert(person.copy() == person)
    }

    @Test
    fun test3() {
        val person = Person()
        val copy = person.copy(firstname = "${person.firstName} 2")

        assert(copy.lastName == person.lastName)
        Assert.assertNotEquals(copy.firstName, person.firstName)
    }
}
