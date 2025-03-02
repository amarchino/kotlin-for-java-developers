package academy.learnprogramming.section8

import java.io.File

fun main() {
    val lines = File("src/main/resources/testfile.txt").reader().readLines()
    lines.forEach { println(it) }

    val text = File("src/main/resources/testfile.txt").reader().use { it.readText() }
    println(text)

    val text2 = File("src/main/resources/testfile.txt").readText()
    println(text2)

    File("src/main/resources/testfile.txt").reader().forEachLine { println(it) }

    File("src/main/resources/testfile.txt").reader().useLines { it.forEach { println(it) } }

}