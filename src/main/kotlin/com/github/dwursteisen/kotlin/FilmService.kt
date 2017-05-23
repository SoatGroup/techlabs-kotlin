package com.github.dwursteisen.kotlin

import java.util.*


data class Movie(val id: String, val title: String)

object Movies {

    private var movies: List<Movie> = emptyList()

    fun list(): Unit {
        println("==== CATALOGUE DE FILM ====")
        if (movies.isEmpty()) {
            println("Aucun film au catalogue")
        } else {
            movies.map { "- " + it }.forEach(::println)
        }
    }

    fun get(id: String): Unit {
        println("==== FICHE FILM $id ====")
        val find = movies.find { it.id.equals(id, true) }
        println(find ?: "Film non trouvé")
    }

    fun add(title: String): Unit {
        val newMovie = Movie(id = UUID.randomUUID().toString().substring(0, 6), title = title)
        movies += newMovie
        println("==== AJOUT FILM ====")
        println("Film : $newMovie")
    }


    fun aide() {
        val help = """
Commandes disponibles :
  - LIST : liste l'ensemble des films
  - GET <id> : affiche la fiche d'un film
  - ADD <titre> : ajoute un film
  - HELP : Affiche cette aide
  - QUIT : quitte le catalogue
"""
        println(help)
    }

}

fun main(args: Array<String>) {
    val helloWorld = """
========= CATALOGUE DE FILM ======

  ****       Bonjour !     *****
"""

    println(helloWorld)
    Movies.aide()

    var quit = false
    while (!quit) {
        print("> ")
        val input = readLine()?.trim() ?: continue
        val (cmd, param) = (input + " ").split(" ".toRegex(), 2)
        when (cmd) {
            "LIST" -> Movies.list()
            "GET" -> Movies.get(param.trim())
            "ADD" -> Movies.add(param.trim())
            "HELP" -> Movies.aide()
            "QUIT" -> quit = true
        }
    }

    println("BYE BYE")

}