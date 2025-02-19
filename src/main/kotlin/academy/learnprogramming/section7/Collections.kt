package academy.learnprogramming.section7

fun main() {
    val strings = listOf("String", "Summer", "Fall", "Winter")
    println(strings.javaClass)

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    if(emptyList.isNotEmpty()) {
        println(emptyList.get(0))
    }

    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)

    val arrayList = arrayListOf(1, 2, 4)
    println(arrayList.javaClass)

    val mutableList = mutableListOf(1, 2, 4)
    println(mutableList.javaClass)

    println(mutableList[2])
    mutableList[1] = 20
    println(mutableList)

    val array = arrayOf("Black", "White", "Green")
    var colorList = array.toList()
    println(colorList)

    var ints = intArrayOf(1, 2, 3)
    println(ints.toList())
}