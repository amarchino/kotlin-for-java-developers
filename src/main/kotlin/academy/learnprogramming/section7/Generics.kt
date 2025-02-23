package academy.learnprogramming.section7

import java.math.BigDecimal

fun main() {
    val list = mutableListOf("Hello")
    list.add("another string")
    list.printCollection()

    val bdList = mutableListOf(BigDecimal("-35.44"), BigDecimal("3503.99"), BigDecimal("0.329"))
    bdList.printCollection()
}

fun <T> List<T>.printCollection() {
    for(item in this) {
        println(item)
    }
}
