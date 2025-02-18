package academy.learnprogramming.section7

fun main() {
    println(countTo100())

    // run { println("I'm in a lambda") }
    val employees = listOf(
        Employee("John", "Smith", 2020),
        Employee("Jane", "Wilson", 2015),
        Employee("Mary", "Johnson", 2010),
        Employee("Mike", "Jones", 2002)
    )
    findByLastName(employees, "Wilson")
    findByLastName(employees, "Smithson")

    // println(employees.minBy { e -> e.startYear })
    // println(employees.minBy { e: Employee -> e.startYear })
    // println(employees.minBy { it.startYear })
    println(employees.minBy(Employee::startYear))

    var num = 10
    run {
        num += 15
        println(num)
    }
    "Some String".apply somestring@ {
        "Another String".apply {
            println(lowercase())
            println(this@somestring.uppercase())
        }
    }

    run(::topLevel)
}

fun countTo100() = StringBuilder().apply {
    for(i in 1..99) {
        append(i)
        append(",")
    }
    append(100)
}.toString()

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@ {
        if(it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName")
            return
            //return@returnBlock
        }
    }
    println("Nope, there's no employee with the last name $lastName")
}

fun topLevel() = println("I'm in a function")

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}