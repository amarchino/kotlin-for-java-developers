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

open class LaserPrinter(modelName: String, val ppm: Int): Printer(modelName), MyInterface {
    override val number: Int = 1

    final override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice() = 129.99
    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }
}

class SpecialLaserPrinter(modelName: String): LaserPrinter(modelName, 100) {
    // override fun printModel() = println("this is my way of doing it")
}

open class Something(val x: Int): MySubInterface {
    var someProperty: String = "something"
    override val number: Int = 25
    override val number2 = 12
    constructor(someParameter: String, y: Int): this(y) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }
    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }
    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }
}
class SomethingElse: Something {
    constructor(someOtherParameter: String, y: Int): super(someOtherParameter, y) {
        println("I'm in the child's constructor")
    }
}

data class DataClass(val number: Int)

interface MyInterface {
    val number: Int
    val number2: Int
        get() = 45
    fun myFunction(str: String): String
}
interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int): String
}
