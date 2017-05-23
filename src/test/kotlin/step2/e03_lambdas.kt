package step2

import org.junit.Test
import java.util.*

class LambdasTest {
    private fun sort(collection: List<Int>): Boolean {
        Collections.sort(collection, object : Comparator<Int> {
            override fun compare(o1: Int, o2: Int): Int {
                return o1 - o2
            }
        })
        return false
    }

    @Test fun e03_01() {
        val list = mutableListOf(19, 7, 90, 45, 4)
        sort(list)
        assert(list == listOf(4, 7, 19, 45, 90))
        
        TODO("Reimplement sort using lambdas")
    }
}