package step3

import movies.Dataset
import movies.MoviesRepository
import org.junit.After
import org.junit.Test
import java.io.File


class e05_DataSet {


    private var movieRepository = MoviesRepository()


    private val moviesDataset by lazy { File(this.javaClass.getResource("/movies.csv").toURI()) }

    @After
    fun tearDown() {
        movieRepository = MoviesRepository()
    }


    @Test
    fun parseLineToMovie_theBigShort() {
        val theBigShort = Dataset.parseLineToMovie("148626,\"Big Short, The (2015)\",Drama")
        assert("Big Short, The (2015)" == theBigShort.title)
        assert("148626" == theBigShort.id)
        assert(theBigShort.genres.contains("Drama"))
    }

    @Test
    fun parseLineToMovie_worldOfTomorrow() {
        val (id, title, genres) = Dataset.parseLineToMovie("148881,World of Tomorrow (2015),Animation|Comedy")
        assert("World of Tomorrow (2015)" == title)
        assert("148881" == id)
        assert(genres.contains("Animation"))
        assert(genres.contains("Comedy"))
    }


    @Test
    fun loadMovies() {
        Dataset.loadMovies(moviesDataset, movieRepository)
        assert(9125 == movieRepository.list().size)
    }



    @Test
    fun categories() {
        Dataset.loadMovies(moviesDataset, movieRepository)
        assert(setOf("Adventure", "Animation", "Children", "Comedy", "Fantasy", "Romance", "Drama", "Action", "Crime", "Thriller", "Horror", "Mystery", "Sci-Fi", "Documentary", "IMAX", "War", "Musical", "Western", "Film-Noir", "(no genres listed)") == movieRepository.categories)

    }

    @Test
    fun moviesByCategory() {
        Dataset.loadMovies(moviesDataset, movieRepository)
        val adventureMovies = movieRepository.moviesWithCategory("Adventure")

        val toyStoryAndTarzan = adventureMovies.map { it.title }.filter { it == "Toy Story (1995)" || it == "The Legend of Tarzan (2016)" }
        assert(toyStoryAndTarzan.size == 2)

    }
}
