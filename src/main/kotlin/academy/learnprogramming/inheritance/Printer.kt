package academy.learnprogramming.inheritance

fun main() {
    var laserPrinter = LaserPrinter("Brother 1234")
    laserPrinter.printModel()
}

abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double
}

class LaserPrinter(modelName: String): Printer(modelName) {

    override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice() = 129.99
}