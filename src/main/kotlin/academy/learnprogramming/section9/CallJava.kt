package academy.learnprogramming.section9

fun main() {
    val car = Car("blue", "Ford", 2015)
    car.color = "green"
    println(car)

    car.variableMethod(5, "Hello", "Goodbye")
    val strings = arrayOf("Hello", "Goodbye")
    car.variableMethod(5, *strings)

    car.wantsIntArray(intArrayOf(1, 2, 3))

    // (car.anObject as java.lang.Object).notify()
    println("x = ${Car.x}")
    println("x = ${Car.xString()}")

    car.demoMethod { println("I'm in a thread") }

    var model: String? = car.model
    println(model?.javaClass)

    model = null
    println(model)
}