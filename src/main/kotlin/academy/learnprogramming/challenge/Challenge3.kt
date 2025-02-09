package academy.learnprogramming.challenge

fun main() {
    val bicycle = KotlinBicycle(10, 3, 10)
    bicycle.printDescription()

    val mountainBike = KotlinMountainBicycle(20, 10, 10, 30)
    mountainBike.printDescription()

    val roadBike = KotlinRoadBicycle(10, 10, 10, 3)
    roadBike.printDescription()

    val bicycle1 = KotlinBicycle(10, 3)
    bicycle1.printDescription()

    val mountainBike1 = KotlinMountainBicycle(20, 10, 10)
    mountainBike1.printDescription()

    val roadBike1 = KotlinRoadBicycle(10, 10, 10)
    roadBike1.printDescription()

    val mountainBike2 = KotlinMountainBicycle("blue", 10, 10, 10)
    mountainBike2.printDescription()

    KotlinMountainBicycle.availableColors.forEach { println(it) }
}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {
    fun applyBrake(decrement: Int) {
        this.speed -= decrement
    }

    fun speedUp(increment: Int) {
        this.speed += increment;
    }

    open fun printDescription() = println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
}
class KotlinMountainBicycle(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10): KotlinBicycle(cadence, speed, gear) {
    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 20): this(seatHeight, cadence, speed, gear) {
        println("This is the $color")
    }
    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "yellow")
    }
}
class KotlinRoadBicycle(val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10): KotlinBicycle(cadence, speed, gear) {
    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth mm.")
    }
}