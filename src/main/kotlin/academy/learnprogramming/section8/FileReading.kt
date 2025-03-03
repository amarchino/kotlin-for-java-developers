package academy.learnprogramming.section8

import java.io.File

fun main() {
    val lines = File("src/academy.learnprogramming.section8.main/resources/testfile.txt").reader().readLines()
    lines.forEach { println(it) }

    val text = File("src/academy.learnprogramming.section8.main/resources/testfile.txt").reader().use { it.readText() }
    println(text)

    val text2 = File("src/academy.learnprogramming.section8.main/resources/testfile.txt").readText()
    println(text2)

    File("src/academy.learnprogramming.section8.main/resources/testfile.txt").reader().forEachLine { println(it) }

    File("src/academy.learnprogramming.section8.main/resources/testfile.txt").reader().useLines { it.forEach { println(it) } }

}