package movies

import internal.REMPLACE_MOI


data class Command(val name: String, val args: String)

object Commands {
    fun fromInput(input: String): Command {
        REMPLACE_MOI("""
fromInput doit extraire d'une chaine de caractère la commande associé.

Une commande est constituée du nom de la commande (ex: GET) et d'un argument (ex: azerty).
L'argument sera vide si celui ci n'existe pas.
        """)
    }

}