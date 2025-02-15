package academy.learnprogramming.challenge

fun main() {
    // 1. Print all number from 5 to 5000 in steps of 5
    // (5..5000 step 5).forEach { println(it) }

    // 2. Print all number from -500 to 0
    // (-500..0).forEach { println(it) }

    // 3. Print the first 15 Fibonacci numbers
    /*
    var secondToLast = 0
    var last = 1
    println(secondToLast)
    println(last)
    (1..13).forEach {
        var tmp = last
        last += secondToLast
        secondToLast = tmp
        println(last)
    }
     */

    /*
    4. Modify the following code to obtain
        1, 11, 100, 99, 98, 2
    for(i in 1..5) {
        println(i)
        for(j in 11..20) {
            println(j)
            for(k in 100 downTo 90) {

            }
        }
    }
     */
    for(i in 1..5) {
        println(i)
        if(i == 2) {
            break
        }
        jloop@for(j in 11..20) {
            println(j)
            for(k in 100 downTo 90) {
                println(k)
                if(k == 98) {
                    break@jloop
                }
            }
        }
    }

    /*
     5. Declare a variable called num (int) and assign it whatever you want
     Declare a number called dnum(double) and assign it as follows:
        if num > 100, assign dnum -234.567
        if num < 100, assign dnum 444.555
        if num == 100, assign dnum 0.0
       The print the value of dnum - separate statement
     */
    val num = 100
    // val dnum = if(num > 100) -234.567 else if (num < 100) 444.555 else 0.0
    val dnum = when {
        num > 100 -> -234.567
        num < 100 -> 444.555
        else -> 0.0
    }
    println(dnum)

}