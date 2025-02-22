package academy.learnprogramming.section7

fun main() {
    val setInts = setOf(10, 15, 19, 5, 3, -22)

    println(setInts.filter { it % 2 != 0 })

    val immutableMap = mapOf(
        1 to MyCar("green", "Toyota", 2015),
        2 to MyCar("red", "Ford", 2016),
        3 to MyCar("silver", "Honda", 2013),
        17 to MyCar("red", "BMW", 2015),
        8 to MyCar("green", "Ford", 2010)
    )
    println(immutableMap.filter { it.value.year == 2016 })
    println(immutableMap.map { it.value.year })
    println(immutableMap.filter { it.value.model == "Ford" }.map { it.value.color })
    println(immutableMap.all { it.value.year > 2014 })
    println(immutableMap.any { it.value.year > 2014 })
    println(immutableMap.count { it.value.year > 2014 })
    println(immutableMap.values.find { it.year > 2014 })
    println(immutableMap.values.groupBy { it.color })
    println(immutableMap.toSortedMap())
    println(immutableMap.values.sortedBy { it.year })

    val mutableMap = mutableMapOf(
        1 to MyCar("green", "Toyota", 2015),
        2 to MyCar("red", "Ford", 2016),
        3 to MyCar("silver", "Honda", 2013)
    )
    mutableMap.filter { it.value.color == "silver" }
    println("This filters map is $mutableMap")

    var ints = arrayOf(1, 2, 3, 4, 5)
    val add10List = ints.map { it + 10 }
    println(add10List)
    println(add10List.javaClass)
}

data class MyCar(val color: String, val model: String, val year: Int) {}