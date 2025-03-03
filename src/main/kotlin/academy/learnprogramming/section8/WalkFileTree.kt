package academy.learnprogramming.section8

import java.io.File

fun main() {
    File(".").walkTopDown()
        .filter { it.name.endsWith(".kt") }
        .forEach { println(it) }
}