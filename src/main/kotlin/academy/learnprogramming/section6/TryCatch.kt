package academy.learnprogramming.section6

fun main() {
    println(getNumber("22"))
    println(getNumber("22.5") ?: "I can't print the result")

    notImplementedYet("string")
}

fun notImplementedYet(something: String): Nothing {
    throw IllegalArgumentException("Implement me!")
}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch(e: NumberFormatException) {
        null
    } finally {
        println("I'm in the finally block")
    }
}