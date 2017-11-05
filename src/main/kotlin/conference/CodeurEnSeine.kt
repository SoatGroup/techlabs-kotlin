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
        // Peut-on utiliser des paramètres només ?
        // Peut-on utiliser des paramètres par défaut ?

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


        val a: Unit = Unit
        val b: Int = 3
        val c: Any = "hello"
        // val d: Int = ERROR()



        class Player(val name: String? = null)
        val player = Player()

        val aNull: String? = null
        val bNull: Int? = 5


        val bStr: String? = bNull?.toString()

        val name = player.name ?: return@`execute💩`
        println(name)

    }















    `execute💩` {

        // 4 - Data class
        // Quelle est la différence entre une data class et une class ?
        // clone d'un objet ? str ? génération des méthodes equals/hashcode ?

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
        // 5 - Collections en kotlin
        // Différentre entre une liste Java et Kotlin ?
        // Niveau API, quelles sont les différences ?

        val lst = emptyList<String>()
        val lst2 = lst + "something" + "else"

        lst2.filter { str -> str.length > 4 }
                .map { it.toUpperCase() }
                .forEach({ println(it) })

    }





















    `execute💩` {
        // 6 - Destructuring variable
        // Mais c'est quoi donc ?
        // Ca marche avec une liste ? Une data class ?

        val (a, b) = listOf("one", "two", "three")

        println(a)
        println(b)

        data class Yop(val a: String, val b: String)

        val yop = Yop("one", "two")
        val (aa, bb) = yop
    }




















    `execute💩` {
        // 7 - Surchage d'opérateur en Kotlin
        // On peut faire quoi avec ? On peut tout surcharger ?

        data class Vector(val x: Int, val y: Int) {
            operator fun plus(other: Vector): Vector {
                return Vector(x + other.x, y + other.y)
            }
        }

        println(Vector(1, 2) + Vector(4, 5))
    }





















    `execute💩` {

        // 8 - Méthodes d'extentions.
        // A quoi ça sert ?
        // Quelle est la différence avec l'héritage ?

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
        // 9 - Sealed class
        // Définition d'une Sealead class ?
        // Exemple d'une sealed class ?
        // Est-ce que cela remplace le pattern visitor ?

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























    `execute` {

        // 10 - Bonus : delegate
        // On delegue la création d'un objet à une autre entité
        class UUIDGenerator {
            operator fun getValue(thisRef: Any?, property: KProperty<*>): UUID {
                println("crate a new uuid")
                return UUID.randomUUID()
            }
        }

        val delegate: UUID by UUIDGenerator()

        println(delegate)
        println(delegate)
        println(delegate)
        println(delegate)
    }




















    blocks.lastOrNull()?.invoke() ?: println("Nothing to invoke. Please remove \uD83D\uDCA9")

}

sealed class Option {
    class Some<T>(val objet: T) : Option()
    object None : Option()

}
