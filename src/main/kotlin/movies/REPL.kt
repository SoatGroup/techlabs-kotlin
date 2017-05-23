package movies

import internal.REMPLACE_MOI
import java.io.File
import java.util.*

fun aide() {
    val help = """
Commandes disponibles :
  - LOAD : charge les films depuis un dataset
  - LIST : liste l'ensemble des films
  - GET <id> : affiche la fiche d'un film
  - ADD <titre> : ajoute un film
  - CATEGORIES : Affiche la liste des catégories
  - CATEGORY <categorie> <limit> : Recherche les films ayant cette categorie avec max <limit> film (option)
  - HELP : Affiche cette aide
  - QUIT : quitte le catalogue
"""
    println(help)
}

fun affiche(title: String, movie: Movie): Unit {
    affiche(title, Collections.singletonList(movie))
}

fun affiche(title: String, data: Collection<Any>): Unit {
    println(AsciiArt.ficheMe(title))
    data.map({"→ " + it.toString()}).forEach(::println)
}

fun main(args: Array<String>) {

    println(AsciiArt.bar(10))


    val helloWorld = """
========= CATALOGUE DE FILM ======

  ****    🙇  ~(Bonjour !)     *****
"""

    println(helloWorld)
    aide()

    val repository = MoviesRepository()

    var quit = false
    while (!quit) {
        print("▶ ")
        val input = readLine()?.trim() ?: continue
        val cmd = Commands.fromInput(input)
        when (cmd.name) {
            "LOAD" -> Dataset.loadMovies(File(Commands.javaClass.getResource("/movies.csv").toURI()), repository)
            "LIST" -> affiche("~~~ Liste de films ~~~", repository.list())
            "GET" -> affiche("~~~ Fiche film ~~~", repository.get(cmd.args))
            "ADD" -> affiche("~~~ Ajout du film ~~~", repository.add(cmd.args))
            "CATEGORIES" -> affiche("~~~ Catégories ~~~", REMPLACE_MOI("Récupération de la liste des catégories disponibles dans le repository") as Collection<Any>)
            "CATEGORY" -> {
                REMPLACE_MOI("Affiche les films correspondant à cette catégorie. Si <limit>, affiche max <limit> films")
            }
            "HELP" -> aide()
            "QUIT" -> quit = true
        }
    }

    println("🙋 ~(BYE BYE)")

}