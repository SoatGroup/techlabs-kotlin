package movies

import internal.REMPLACE_MOI
import java.util.*

data class Movie(val id: String, val title: String, val genres: List<String> = ArrayList())

class MoviesRepository {

    private fun generateRandomId(): String  = UUID.randomUUID().toString().substring(0, 5)

    val categories by lazy {
        list().flatMap { it.genres }.toSet()
    }


    fun list(): Collection<Movie> {
        return movies
    }


    fun get(id: String): Movie {
        return movies.filter { it.id == id}.first()

    }

    private var movies: List<Movie> = ArrayList()

    fun add(movie: Movie) : Movie {
        this.movies = this.movies + movie
        return movie

    }

    fun add(title: String): Movie {
        return add(Movie(generateRandomId(), title))
    }

    fun moviesWithCategory(category: String): Collection<Movie> {
        return movies.filter { it.genres.contains(category) }
    }

}