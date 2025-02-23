package academy.learnprogramming.section7

fun main() {
    val immutableMap = mapOf(
        1 to MyCar2("green", "Toyota", 2015),
        2 to MyCar2("red", "Ford", 2016),
        3 to MyCar2("silver", "Honda", 2013),
        17 to MyCar2("red", "BMW", 2015),
        8 to MyCar2("green", "Ford", 2010)
    )
    println(immutableMap.asSequence()
        .filter { it.value.model == "Ford"}
        .map { it.value.color }
        .toList())

    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filtering $it"); it[0] == 'J' }
        .map { println("Mapping $it"); it.uppercase() }
        .find{ it.endsWith('E') }
}

data class MyCar2(val color: String, val model: String, val year: Int) {}
