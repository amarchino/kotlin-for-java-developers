package academy.learnprogramming.section6

fun main() {
    val someCondition = 20 < 22

    val num = if(someCondition) 50 else 592
    println(num)

    val num2 = if(someCondition) {
        println("Something")
        50
    } else {
        println("Something else")
        592
    }
    println(num2)

    println("The result of the if expression is ${if(someCondition) {
        println("Something")
        50
    } else {
        println("Something else")
        592
    }}")

    val x = if(someCondition) {
        println("Something")
    } else {
        println("Something else")
    }
    println(x.javaClass)
}