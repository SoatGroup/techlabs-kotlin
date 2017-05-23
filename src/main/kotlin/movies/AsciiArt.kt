package movies

import internal.REMPLACE_MOI


object AsciiArt {
    fun bar(x: Int): String {
        REMPLACE_MOI("Cette méthode doit retourne une chaine de caractère contenant x point. Pour cela, utilisez une boucle for.")
    }

    fun ficheMe(str: String): String {
        REMPLACE_MOI("""Cette méthode doit retourne la chaine de caractère mais contenu dans une boîte de style ascii art.
exemple:

+-------------+
| hello world |
+-------------+

Astuce : la méthode bar() devrait vous aider. De plus, saviez-vous qu'il est possible d'appeller une méthode, même dans l'interpolation de String ?
""")

    }
}