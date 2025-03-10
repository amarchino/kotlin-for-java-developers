package academy.learnprogramming.section7

import kotlin.collections.iterator

fun main() {

    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.plus(20))
    println(setInts.plus(10))
    println(setInts.minus(19))
    println(setInts.minus(100))
    println(setInts.average())
    println(setInts.drop(3))

    val mutableInts = mutableSetOf(1, 2, 3, 4, 5)
    mutableInts.plus(10)
    println(mutableInts)

    val immutableMap = mapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013))
    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = hashMapOf(
        "John's car" to Car("red", "Range Rover", 2010),
        "Jane's car" to Car("blue", "Hyundai", 2012))
    println(mutableMap.javaClass)
    println(mutableMap)
    mutableMap.put("Mary's car", Car("red", "Corvette", 1965))

    for((k, v) in mutableMap) {
        println("$k => $v")
    }

    val pair = Pair(10, "ten")
    val (firstValue, secondValue) = pair

    val car = Car("blue", "Corvette", 1959)
    val (color, model, year) = car
    println("color = $color, model = $model, year = $year")
}

data class Car(val color: String, val model: String, val year: Int) {
    //operator fun component1() = color
    //operator fun component2() = model
    //operator fun component3() = year
}