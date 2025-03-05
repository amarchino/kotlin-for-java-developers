package academy.learnprogramming.section6

import kotlin.text.iterator

fun main() {
    val range = 1..5
    for(i in range) {
        println(i)
    }
    for(num in 1..20 step 4) {
        println(num)
    }
    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"

    val str = "Hello"
    for (c in str) {
        println(c)
    }

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCCC" in stringRange)
    println("ZZZZZZ" in stringRange)

    val backwardRange = 5.downTo(1)
    val r = 5..1
    println(5 in r)
    println(5 in backwardRange)

    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    stepThree.forEach { println(it) }
    val reversesRange = range.reversed()

    for(i in 20 downTo 15) {
        println(i)
    }

    for(i in 20 downTo 10 step 5) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    var seasons = arrayOf("Spring", "Summer", "Fall", "Winter")
    for(index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }
    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("$value is season number $index") }

    val notASeason = "whatever" !in seasons
    println(notASeason)

    var notInRange = 32 !in 1..10
    println(notInRange)

    var str1 = "Hello"
    println('e' in str1)
    println('e' !in str1)

    for (i in 1..3) {
        println("i = $i")
        jloop@ for(j in 1..4) {
            println("j = $j")
            for(k in 5..10) {
                println("k = $k")
                if(k == 7) {
                    continue@jloop
                }
            }
        }
    }

}