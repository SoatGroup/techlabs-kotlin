package step3

import movies.MoviesRepository
import org.junit.After
import org.junit.Assert
import org.junit.Test

class e03_MoviesRepository {

    private var repository = MoviesRepository()

    @After
    fun tearDown() {
        repository = MoviesRepository()
    }

    @Test
    fun add_and_get() {
        val movie = repository.add("batman")
        val dbMovie = repository.get(movie.id)

        assert(movie == dbMovie)
    }


    @Test
    fun list() {
        val newMovie = repository.add("hello")
        val movies = repository.list()

        Assert.assertTrue(movies.contains(newMovie))
    }

}