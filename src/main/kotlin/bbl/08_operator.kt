package bbl

import java.math.BigDecimal


data class Money(val value: BigDecimal) {
    operator fun plus(other: Money): Money {
        return Money(value.add(other.value))
    }
}



fun main(args: Array<String>) {
    val new = Money(BigDecimal.ONE) + Money(BigDecimal.TEN)

    println(new)
}