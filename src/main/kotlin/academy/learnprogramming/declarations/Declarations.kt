package academy.learnprogramming.declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {

    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)

    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree)

    println(employeeOne === employeeTwo)
    println(employeeTwo === employeeThree)

    var employeeFour = employeeTwo
    println(employeeTwo === employeeFour)

    println(employeeFour != employeeTwo)
    println(employeeFour !== employeeTwo)
    println(employeeTwo != employeeThree)
    println(employeeTwo !== employeeThree)

    var number: Int
    number = 10
    number = 6

    val names = arrayListOf("John", "Jane", "Mary")
    println(names[1])

    val employees: EmployeeSet

    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"

    val employee2: Employee
    val number2 = 100

    if(number < number2) {
        employee2 = Employee("Jane Smith", 400)
    } else {
        employee2 = Employee("Mike Watson", 150)
    }


}

class Employee(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if(other is Employee) {
            return name == other.name && id == other.id
        }
        return false
    }
}