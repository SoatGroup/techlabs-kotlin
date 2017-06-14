package bbl.solution

import java.math.BigDecimal


data class Money(val value: java.math.BigDecimal) {
    operator fun plus(other: bbl.solution.Money): bbl.solution.Money {
        return bbl.solution.Money(value.add(other.value))
    }
}



fun main(args: Array<String>) {
    val new = bbl.solution.Money(java.math.BigDecimal.ONE) + bbl.solution.Money(java.math.BigDecimal.TEN)

    println(new)
}