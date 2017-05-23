package movies

import internal.REMPLACE_MOI
import java.io.File

object Dataset {

    fun loadMovies(file: File, repository: MoviesRepository) {
        file.readLines().drop(1).map { parseLineToMovie(it) }.forEach { repository.add(it) }
    }


    fun parseLineToMovie(line: String): Movie {

        return if (line.contains("\"")) {
            val movieId = line.substringBefore(",")
            val genres = line.substringAfterLast(",")
            val title = line.substringAfter("\"").substringBefore("\"")
            Movie(movieId, title, genres.split("|"))
        } else {
            val (movieId, title, genres) = line.split(",")
            Movie(movieId, title, genres.split("|"))
        }

    }

}