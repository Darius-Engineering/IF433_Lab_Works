package oop_00000165494_dariusemmanueleudiahariman.week03

fun main() {
    val e = Employee("Budi")
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    //Task 1
    println("\nTask 1 (Weapon Testing)")
    val w = Weapon("Wooden Stick")
    w.damage = -50
    println("Damage: ${w.damage}")
    w.damage = 9999
    println("Damage: ${w.damage}")
    println("Tier: ${w.tier}")
}