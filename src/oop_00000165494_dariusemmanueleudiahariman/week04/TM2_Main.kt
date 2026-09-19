package oop_00000165494_dariusemmanueleudiahariman.week04

fun main() {
    println("--- Testing Manager ---")
    val manager = Manager("John Doe", 20000000)
    manager.work()
    val ManagerBonus = manager.calculateBonus()
    println("Manager ${manager.name} mendapatkan bonus sebesar: Rp $ManagerBonus")

    println("\n--- Testing Developer ---")
    val frontEndDev = Developer("Mark", 15000000, "ReactJS")
    frontEndDev.work()
    val DevBonus = frontEndDev.calculateBonus()
    println("Developer ${frontEndDev.name} mendapatkan bonus sebesar: Rp $DevBonus")
}