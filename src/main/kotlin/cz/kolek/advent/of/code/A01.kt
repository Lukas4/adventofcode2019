package cz.kolek.advent.of.code

class A01 {

    fun run1() : Int {
        return Utils.readAllLines("a01.txt").map { it.toInt() }.map { it / 3 - 2 }.sum()
    }

    fun run2() : Int {
        return Utils.readAllLines("a01.txt").map { it.toInt() }.map { recursiveSum(it) }.sum()
    }

    fun recursiveSum(fuel : Int) : Int {
        val newFuel = fuel / 3 - 2
        return if (newFuel > 0) newFuel + recursiveSum(newFuel) else 0
    }
}