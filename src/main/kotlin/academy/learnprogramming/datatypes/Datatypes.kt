package academy.learnprogramming.datatypes

import academy.learnprogramming.javacode.datatypes.DummyClass
import java.math.BigDecimal

fun main() {
    val myInt = 10
    println("Default datatype is Int? ${myInt is Int}")
    var myLong = 22L
    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    val anotherInt = 5
    var myDouble = 65.984
    println(myDouble is Double)

    val myFloat = 838.8492f
    println("This is a float: ${myFloat is Float}")
    myDouble = myFloat.toDouble()

    val char = 'C'
    val myChar: Char = 65.toChar()
    println(myChar)

    val myBoolean = true

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

    val anything: Any
    val unit: Unit
    val nothing: Nothing

    val names = arrayOf("John", "Jane", "Jill", "Joe")
    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)
    val longs3 = arrayOf(1, 2, 3, 4)
    println(longs1 is Array<Long>)
    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)

    println(longs1[2])

    val evenNumbers = Array(16) { it * 2 }
    for (number in evenNumbers) {
        println(number)
    }
    val lotsOfNumbers = Array(100_000) { it + 1 }
    val allZeroes = Array(100) { 0 }

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    someArray = Array(6) { (it + 1) * 10 }
    for (number in someArray) {
        println(number)
    }

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for (element in mixedArray) {
        println(element)
    }
    val myIntArray = intArrayOf(3, 9, 434, 2, 33)
    DummyClass().printNumbers(myIntArray)

    //var someOtherArray = Array<Int>(5)
    var someOtherArray = IntArray(5)
    for (number in someOtherArray) {
        println(number)
    }
    DummyClass().printNumbers(evenNumbers.toIntArray())
    val convertedIntArray = myIntArray.toTypedArray()
}