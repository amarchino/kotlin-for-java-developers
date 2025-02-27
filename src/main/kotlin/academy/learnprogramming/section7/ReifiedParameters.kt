package academy.learnprogramming.section7

import java.math.BigDecimal

fun main() {
    val mixedList = listOf("string", 1, BigDecimal("22.5"), "fail", BigDecimal("-5938.393849"))
    val bigDecimalsOnly = getElementsOfType<String>(mixedList)
    for(item in bigDecimalsOnly) {
        println(item)
    }
}

inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    var newList: MutableList<T> = mutableListOf();
    for(element in list) {
        if(element is T) {
            newList.add(element)
        }
    }
    return newList
}