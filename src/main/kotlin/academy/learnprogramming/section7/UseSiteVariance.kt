package academy.learnprogramming.section7

fun main() {
    val cars1 = mutableListOf(USVCar(), USVCar())
    val cars2: MutableList<USVCar> = mutableListOf()
    copyCars(cars1, cars2)

    val fords1 = mutableListOf(Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()
    copyCars(fords1, fords2)

    copyCars(fords1, cars2)

    val cars3: MutableList<USVCar> = mutableListOf(Ford(), Ford())
}

fun <T: USVCar> copyCars(source: MutableList<out T>, destination: MutableList<in T>) {
    for(car in source) {
        destination.add(car)
    }
}

open class USVCar
class Toyota: USVCar()
class Ford: USVCar()