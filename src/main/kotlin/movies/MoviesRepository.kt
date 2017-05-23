package movies

import internal.REMPLACE_MOI
import java.util.*

data class Movie(val id: String, val title: String, val genres: List<String> = ArrayList())

class MoviesRepository {

    private fun generateRandomId(): String  = UUID.randomUUID().toString().substring(0, 5)

    val categories:List<String> by lazy {
        REMPLACE_MOI("Cette lambda doit extraire tous les genres de tous les films")
    }


    fun list(): Collection<Movie> {
        REMPLACE_MOI("Cette méthode doit lister l'ensemble des films connues !")
    }


    fun get(id: String): Movie {
        REMPLACE_MOI("Cette méthode doit afficher les informations du film")

    }

    private var movies: List<Movie> = ArrayList()

    fun add(movie: Movie) : Movie {
        REMPLACE_MOI("Cette méthode ajoute le film en paramètre dans la liste des films")
    }

    fun add(title: String): Movie {
        REMPLACE_MOI("Cette méthode doit ajouter un film dans le dépot, avec un identifiant généré automatiquement. " +
                "L'identifiant peut être généré grâce à la méthode generateRandomId.")

    }

    fun moviesWithCategory(category: String): Collection<Movie> {
        REMPLACE_MOI("Cette méthode doit retourner tous les films ayant comme catégorie la catégorie fourni en paramètre")
    }

}