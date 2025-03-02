package academy.learnprogramming.challenge

fun main() {
    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    val (fName, lName, age) = joe
    println("fName: $fName, lName: $lName, age: $age")

    val people = mapOf(
        joe.lastName to joe,
        jane.lastName to jane,
        mary.lastName to mary,
        john.lastName to john,
        jean.lastName to jean,
    )
    println( people.filter { it.value.lastName.startsWith("S") }.count() )
    println( people.map { Pair(it.value.firstName, it.value.lastName) } )

    people.also {
        it.map { println("${it.value.firstName} is ${it.value.age} years old") }
    }

    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)
    println(list1.intersect(list2))

    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper;

}

class Person(val firstName: String, val lastName: String, val age: Int) {
    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age
}

class Box<out T>
open class Paper
class Regular: Paper()
class Premium: Paper()