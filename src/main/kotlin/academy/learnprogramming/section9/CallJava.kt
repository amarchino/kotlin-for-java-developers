package academy.learnprogramming.section9

fun main() {
    val car = Car("blue", "Ford", 2015)
    car.color = "green"
    println(car)

    var model: String? = car.model
    println(model?.javaClass)

    model = null
    println(model)
}