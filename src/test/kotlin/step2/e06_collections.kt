package step2

import org.junit.Assert
import org.junit.Test

class CollectionsTest {


    @Test
    fun test_flatmap() {
        val list = listOf("abc", "12")
        Assert.assertEquals(list, listOf('a', 'b', 'c', '1', '2'))
    }

    @Test
    fun test_map_filter() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        Assert.assertEquals(list, listOf(10, 30, 50, 70, 90))
    }

    @Test
    fun test_sort() {
        val list = listOf("a", "bbb", "cc")
        Assert.assertEquals(list, listOf("a", "cc", "bbb"))
    }

    @Test
    fun test_groupby() {
        val list = listOf("a", "b", "ba", "ccc", "ad")
        Assert.assertEquals(list, mapOf(1 to listOf("a", "b"), 2 to listOf("ba", "ad"), 3 to listOf("ccc")))
    }

    @Test
    fun test_sum() {
        val result = listOf(1, 2, 3, 4)
        Assert.assertEquals(result, 10)
    }

    @Test
    fun test_fold() {
        val result = listOf(1, 2, 3, 4)
        Assert.assertEquals(result, 24)
    }

}
