package academy.learnprogramming.inheritance

import java.time.Year

fun main() {
    println(Department.ACCOUNTING.getDepartmentInfo())

    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
    println(SomeClass.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("this is the string as is")
    val someClass2 = SomeClass.upperOrLowerCase("This isn't the string as is", false)
    println(someClass1.someString)
    println(someClass2.someString)

    var thisIsMutable = 45

    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(num: Int): String {
            thisIsMutable++
            return "This is from mustImplement: ${num * 100}"
        }
    })
    println(thisIsMutable)
}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5),
    IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3),
    SALES("Sales", 20);

    fun getDepartmentInfo() = "The $fullName department has $numEmployees employes"
}

object CompanyCommunications {
    val currentYear = Year.now().value
    fun getTagLine() = "Out company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved"
}

class SomeClass private constructor(val someString: String) {
    companion object {
        private val privateVal = 0
        fun accessPrivateVar() = "I'm accessing privateVar: $privateVal"
        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            return if(lowerCase) {
                SomeClass(str.lowercase())
            } else {
                SomeClass(str.uppercase())
            }
        }
    }
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface: ${si.mustImplement(22)}")
}
