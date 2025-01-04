package academy.learnprogramming.nullreferences

fun main() {
    var str: String? = null
    if(str != null) {
        str.uppercase()
    }
    str?.uppercase()
    println("What happens when we do this? ${str?.uppercase()}")
    // println("What happens when we do this? ${str!!.uppercase()}")

    // val countryCode: String? = bankBranch?.address?.country?.countryCode ?: "IT"

    val str2 = str ?: "This isn't null"
    println(str2)

    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String
    println(str3)
    println(str3?.uppercase())

    val str1: String? = "This isn't null"
    str1?.let { printText(it) }
    val str4 = str1!!.uppercase()

    val str5: String? = null
    val anotherString: String = "This isn't nullable"
    println(str5 == anotherString)
}

fun printText(text: String) {
    println(text)
}