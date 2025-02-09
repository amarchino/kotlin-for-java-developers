package academy.learnprogramming.challenge

fun main() {

}

open class KotlinBicycle(var cadence: Int, var gear: Int, var speed: Int) {
    fun applyBrake(decrement: Int) {
        this.speed -= decrement
    }

    fun speedUp(increment: Int) {
        this.speed += increment;
    }

    open fun printDescription() = println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
}
class KotlinMountainBicycle(cadence: Int, gear: Int, speed: Int, var seatHeight: Int): KotlinBicycle(cadence, gear, speed) {
    // Nothing
    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}
class KotlinRoadBicycle(cadence: Int, gear: Int, speed: Int, val tireWidth: Int): KotlinBicycle(cadence, gear, speed) {
    // Nothing
    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth mm.")
    }
}