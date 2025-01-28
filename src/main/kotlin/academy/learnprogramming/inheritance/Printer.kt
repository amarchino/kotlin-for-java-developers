package academy.learnprogramming.inheritance

fun main() {
    var laserPrinter = LaserPrinter("Brother 1234", 15)
    laserPrinter.printModel()

    SomethingElse("Whatever", 1)
}

abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, val ppm: Int): Printer(modelName) {

    final override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice() = 129.99
}

class SpecialLaserPrinter(modelName: String): LaserPrinter(modelName, 100) {
    // override fun printModel() = println("this is my way of doing it")
}

open class Something(val x: Int) {
    var someProperty: String = "something"
    constructor(someParameter: String, y: Int): this(y) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }
}
class SomethingElse: Something {
    constructor(someOtherParameter: String, y: Int): super(someOtherParameter, y) {
        println("I'm in the child's constructor")
    }
}

data class DataClass(val number: Int)
