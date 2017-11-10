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


        // TODO: déclarer 2 variables et utiliser un println
    }












    `execute💩` {

        // 2 - Méthode et paramètre
        // Quelle est la syntaxe des paramètres ?
        // Peut-on utiliser des paramètres només ?
        // Peut-on utiliser des paramètres par défaut ?

        // TODO: créer une méthode add avec 2 paramètres.

    }

















    `execute💩` {

        // 3 - Nouveaux types
        // Int - Int?
        // Unit / Any / Nothing


        fun ERROR(): Nothing {
            throw RuntimeException()
        }


        // TODO: déclarer une variable Unit/Int/Any/Nothing



        // TODO: créer une class avec un champ nullable

    }















    `execute💩` {

        // 4 - Data class
        // Quelle est la différence entre une data class et une class ?
        // clone d'un objet ? str ? génération des méthodes equals/hashcode ?

        // TODO: Crer une class Person et DataPerson en data class

    }



















    `execute💩` {
        // 5 - Collections en kotlin
        // Différentre entre une liste Java et Kotlin ?
        // Niveau API, quelles sont les différences ?


        // TODO: creer des listes et utiliser l'API


    }





















    `execute💩` {
        // 6 - Destructuring variable
        // Mais c'est quoi donc ?
        // Ca marche avec une liste ? Une data class ?

        // TODO: descruire une liste pour une data class
    }




















    `execute💩` {
        // 7 - Surchage d'opérateur en Kotlin
        // On peut faire quoi avec ? On peut tout surcharger ?

        data class Vector(val x: Int, val y: Int) {

        }

        // TODO: créer un opérateur sur le vecteur
    }





















    `execute💩` {

        // 8 - Méthodes d'extentions.
        // A quoi ça sert ?
        // Quelle est la différence avec l'héritage ?

        // TODO: creer une méthode d'ext pluralizes
    }























    `execute💩` {
        // 9 - Sealed class
        // Définition d'une Sealead class ?
        // Exemple d'une sealed class ?
        // Est-ce que cela remplace le pattern visitor ?

        // TODO: utiliser sealed class Option
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

        // TODO: creer une variable depuis le delegate puis lazy
    }




















    blocks.lastOrNull()?.invoke() ?: println("Nothing to invoke. Please remove \uD83D\uDCA9")

}

sealed class Option {
    class Some<T>(val objet: T) : Option()
    object None : Option()

}
