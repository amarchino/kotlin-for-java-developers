package academy.learnprogramming.section7

fun main() {
    val flowerTender = object: FlowerCare<ContravarianceFlower> {
        override fun prune(flower: ContravarianceFlower) = println("I'm tending a ${flower.name}!")
    }

    val roseGarden = ContravarianceGarden<ContravarianceRose>(listOf(ContravarianceRose(), ContravarianceRose()), flowerTender)
    roseGarden.tendFlower(0)

    val daffodilGarden = ContravarianceGarden<ContravarianceDaffodil>(listOf(ContravarianceDaffodil(), ContravarianceDaffodil(), ContravarianceDaffodil()), flowerTender)
    daffodilGarden.tendFlower(2)
}

class ContravarianceGarden<T: ContravarianceFlower> (val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFLower(i: Int) = flowers[i]
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}

open class ContravarianceFlower(val name: String)
class ContravarianceRose: ContravarianceFlower("Rose")
class ContravarianceDaffodil: ContravarianceFlower("Daffodil")

interface FlowerCare<in T> {
    fun prune(flower: T)
    // fun pick(): T
}