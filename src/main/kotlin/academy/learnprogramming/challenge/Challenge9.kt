// @file:JvmName("KotlinStuff")
package academy.learnprogramming.challenge

import academy.learnprogramming.javacode.challange.Challenge9

fun main() {
    val employee = Challenge9.Employee("Jane", "Smith", 2000)
    employee.lastName = "Jones"
    employee.salaryLast3Years = floatArrayOf(50000.25f, 54000.60f, 56800.42f)
}

fun sayHelloToJava(name: String) {
    println("Kotlin says hello to Java and $name")
}

object Challenge {
    // @JvmStatic fun doMath(x: Int, y: Int) = (x + y) * (x - y)
    fun doMath(x: Int, y: Int) = (x + y) * (x - y)
}

class Challenge9Employee(val firstName: String, val lastName: String, /*@JvmField*/ var startYear: Int) {
    // @JvmOverloads
    fun takesDefault(param1: String, param2: String = "default") {
        println("$param1 and $param2")
    }
}