package conference

import java.util.*
import kotlin.reflect.KProperty


var blocks: List<() -> Unit> = emptyList()

fun `execute`(block: () -> Unit) {
    blocks += block
}

fun `execute💩`(block: () -> Unit) {

}


fun main(args: Array<String>) {


    `execute💩` {

        // 1 - Syntaxe
        // Quelle est la différence avec du code Java ?
        // Qu'est ce que la String interpolation ?


        val i: Int = 3
        val str: String = "World"

        println("Hello $str! Votre age ? $i")
    }












    `execute💩` {

        // 2 - Méthode et paramètre
        // Quelle est la syntaxe des paramètres ?
        // Peux on utiliser des paramètres només ?
        // Peut on utilser des paramètres par défaut ?

        fun add(a: Int, b: Int): Int {
            return a + b
        }


        println(add(1, 2))
        println(add(a = 1, b = 2))
        println(add(1, b = 2))
        println(add(1, 2))

    }

















    `execute💩` {

        // 3 - Nouveaux types
        // Int - Int?
        // Unit / Any / Nothing
        fun ERROR(): Nothing {
            throw RuntimeException()
        }

        class Player(val name: String? = null)

        val a: Unit = Unit
        val b: Int = 3
        val c: Any = "hello"
        //   val d: Int = ERROR()

        val player = Player()

        val aNull: String? = null
        val bNull: Int? = 5


        val bStr: String? = bNull?.toString()

        val name = player.name ?: return@`execute💩`
        println(name)

    }















    `execute💩` {

        class PersonName(var firstName: String, var lastName: String) {

            fun concat(): String {
                return "$firstName $lastName"
            }

        }


        data class DataPersonName(var firstName: String, var lastName: String) {
            fun concat(): String {
                return "$firstName $lastName"
            }
        }

        val personName = PersonName("first", "last")
        val data = DataPersonName("first", "last")

        val data2 = data.copy(lastName = "lastname copy")
        println(personName)
        println(data)

    }



















    `execute💩` {
        val lst = emptyList<String>()
        val lst2 = lst + "something" + "else"

        lst2.filter { str -> str.length > 4 }
                .map { it.toUpperCase() }
                .forEach({ println(it) })

    }





















    `execute💩` {
        val (a, b) = listOf("one", "two", "three")

        println(a)
        println(b)

        data class Yop(val a: String, val b: String)

        val yop = Yop("one", "two")
        val (aa, bb) = yop
    }




















    `execute💩` {
        data class Vector(val x: Int, val y: Int) {
            operator fun plus(other: Vector): Vector {
                return Vector(x + other.x, y + other.y)
            }
        }

        println(Vector(1, 2) + Vector(4, 5))
    }





















    `execute💩` {

        fun String.pluralize(nb: Int): String {
            if (nb > 1) {
                return this + "s"
            } else {
                return this
            }
        }

        println("avion".pluralize(1))
        println("avion".pluralize(2))
        println("avion".pluralize(20))
    }























    `execute💩` {
        val something: Option = Option.Some("hello")


        val str = when (something) {
            is Option.Some<*> -> {
                something.objet.toString()
            }
            is Option.None -> {
                "none !"
            }
        }

        println(str)
    }























    `execute💩` {
        class UUIDGenerator {
            operator fun getValue(thisRef: Any?, property: KProperty<*>): UUID {
                return UUID.randomUUID()
            }
        }

        val delegate: UUID by UUIDGenerator()

        println(delegate)
    }




















    blocks.lastOrNull()?.invoke() ?: println("Nothing to invoke. Please remove \uD83D\uDCA9")

}

sealed class Option {
    class Some<T>(val objet: T) : Option()
    object None : Option()

}
