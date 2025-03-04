@file:JvmName("StaticCar")

package academy.learnprogramming.section9

fun topLevel() = println("I'm in the KotlinCarCode file!")

fun main() {
    "Print this".print()
}

class KotlinCar(color: String, @JvmField val model: String, val year: Int, val isAutomatic: Boolean) {
    var color: String = color
        set(value) {
            field = "always green"
        }
}

fun String.print() {
    println(this)
}