

data class Movie(val title: String)
data class Actors(val name: String)

object MovieRepository {
    fun find(criteria: String): List<Movie> {
        return arrayListOf(Movie("sample"))
    }

    @JvmName("removeAllMovies")
    fun removeAll(movies: List<Movie>) : Unit {

    }

    @JvmName("removeAllActors")
    fun removeAll(actors: List<Actors>) : Unit {

    }
}

fun main(args: Array<String>) {

    var input: String? = "";

    do {
        input = readLine()
        println(MovieRepository.find(input ?: ""))
    } while (input != "END")

}