package academy.learnprogramming.datatypes

import academy.learnprogramming.datatypes.javacode.DummyClass

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
}