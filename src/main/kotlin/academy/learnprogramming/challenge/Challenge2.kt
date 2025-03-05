package academy.learnprogramming.challenge

import academy.learnprogramming.javacode.challange.Challenge2

fun main() {
    // 1. Declare a non-nullable float variable two ways, and assign it the value -3847.384
    val fl1 = -3847.384f
    val fl2: Float = -3847.384f

    // 2. Now change both of those variable declarations into nullable variables
    val fl3: Float? = -3847.384f
    val fl4: Float? = (-3847.384).toFloat()

    // 3. Not declare an array of type non-nullable Short. Make it size 5, and assign it the values 1, 2, 3, 4, 5
    val shortArray = shortArrayOf(1, 2, 3, 4, 5)

    // 4. Now declare an array of nullable Ints and initialize it with the values 5, 10, etc. all the way up to 200
    val intArray = Array<Int?>(40) { (it + 1) * 5 }

    // 5. You have to call a Java method with the following signature from Kotlin: public void method1(char[] charArray).
    //    Declare an array that you could pass to the method and initialize it with the values 'a', 'b' and 'c'
    val charArray = charArrayOf('a', 'b', 'c')
    Challenge2().method1(charArray)

    // 6. Given the following code
    val x: String? = "I AM IN UPPERCASE"
    //    Using only one line of code, declare another string variable, and assign it to x.toLowerCase() when x isn't
    //    null, and the string "I give up!" when x is null
    val y = x?.lowercase() ?: "I give up!"

    // Now use the let function to (a) lowercase the string, and then (b) replace "am" with "am not" in the result
    val z = x?.let { it.lowercase().replace("am", "am not") }

    // 8. You're really, really confident that the variable myNonNullVariable can't contain null.
    // Change the following code to assert that myNonNullVariable isn't null (and shoot yourself in the foot!)
    val myNonNullVariable: Int? = null
    // myNonNullVariable?.toDouble()
    myNonNullVariable!!.toDouble()
}