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


    }












    `execute💩` {

        // 2 - Méthode et paramètre
        // Quelle est la syntaxe des paramètres ?
        // Peut-on utiliser des paramètres par défaut ?
        // Peut-on utiliser des paramètres només ?


    }

















    `execute💩` {

        // 3 - Nouveaux types
        // Int - Int?
        // Unit / Any / Nothing


        fun ERROR(): Nothing {
            throw RuntimeException("*** OUPS ***")
        }



    }















    `execute💩` {

        // 4 - Data class
        // Quelle est la différence entre une data class et une class ?
        // clone d'un objet ? str ? génération des méthodes equals/hashcode ?
        class Person(lastname: String, firstname: String)

    }



















    `execute💩` {
        // 5 - Collections en kotlin
        // Différentre entre une liste Java et Kotlin ?
        // Niveau API, quelles sont les différences ?

        val firstName = listOf("John", "John", "Arnold", "Bob")
        val lastName = listOf("Doe", "Connor", "schwarzenegger", "Sponge")


    }





















    `execute💩` {
        // 6 - Destructuring variable
        // Mais c'est quoi donc ?
        // Ca marche avec une liste ? Une data class ?

    }




















    `execute💩` {
        // 7 - Surchage d'opérateur en Kotlin
        // On peut faire quoi avec ? On peut tout surcharger ?

        data class Vector(val x: Int, val y: Int) {

        }

    }





















    `execute💩` {

        // 8 - Méthodes d'extentions.
        // A quoi ça sert ?
        // Quelle est la différence avec l'héritage ?

    }























    `execute💩` {
        // 9 - Sealed class
        // Définition d'une Sealead class ?
        // Exemple d'une sealed class ?
        // Est-ce que cela remplace le pattern visitor ?

    }























    `execute💩` {

        // 10 - Bonus : delegate
        // On delegue la création d'un objet à une autre entité
        class UUIDGenerator {
            operator fun getValue(thisRef: Any?, property: KProperty<*>): UUID {
                println("crate a new uuid")
                return UUID.randomUUID()
            }
        }

    }




















    blocks.lastOrNull()?.invoke() ?: println("Nothing to invoke. Please remove \uD83D\uDCA9")

}

sealed class Option {
    class Some<T>(val objet: T) : Option()
    object None : Option()

}
