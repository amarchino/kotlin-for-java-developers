@file:JvmName("StaticCar")

package academy.learnprogramming.section9

import java.io.IOException
import kotlin.jvm.Throws

fun topLevel() = println("I'm in the KotlinCarCode file!")

fun main() {
    "Print this".print()
}

@JvmOverloads fun defaultArgs(str: String, num: Int = 25) {

}

@Throws(IOException::class) fun doIO() {
    throw IOException()
}

class KotlinCar(color: String, @JvmField val model: String, val year: Int, val isAutomatic: Boolean) {
    var color: String = color
        set(value) {
            field = "always green"
        }

    companion object {
        const val constant = 25
        @JvmStatic val isAuto = false
        @JvmStatic fun carComp() = println("I'm in KotlinCar companion object")
    }

    fun printMe(text: String) {
        println("I don't expect a null value: $text")
    }
}
object SingletonObj {
    @JvmStatic fun doSomething() = println("I'm doing something in the singoleton object")
}

fun String.print() {
    println(this)
}