package academy.learnprogramming.section7

fun main() {
    val strings = listOf("Spring", "Summer", "Fall", "Winter")
    val colorList = listOf("Black", "White", "Green", "Red", "Black", "Red")

    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("some other season")
    println(mutableSeasons)

    println(strings.last())
    println(strings.asReversed())
    println(strings.getOrNull(5))

    val ints = listOf(1, 2, 3, 4, 5)
    println(ints.max())

    println(colorList.zip(strings))
    println(listOf(colorList, strings))
    println(colorList + strings)

    println(colorList.union(strings))

    println(colorList.distinct())
}