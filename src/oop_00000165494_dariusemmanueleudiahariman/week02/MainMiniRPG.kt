package oop_00000165494_dariusemmanueleudiahariman.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- Mini RPG Battle ---")
    print("Masukkan nama hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan stat damage hero: ")
    val statDamage = scanner.nextInt()

    scanner.nextLine()

    val hero = Hero(heroName, statDamage)
    var enemyHp = 100
    val enemyName = "Gooner"

    println("Game Start! $heroName vs $enemyName ($enemyHp Hp)")

    while(hero.isAlive() && enemyHp > 0) {
        println("Menu: 1. Serang | 2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()
        scanner.nextLine()

        if(choice == 1) {
            hero.attack(enemyName)
            enemyHp -= hero.baseDamage
            if(enemyHp < 0) enemyHp = 0
            println("HP $enemyName tersisa: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("$enemyName menyerang hero dengan damage $enemyDamage")
                hero.takeDamage(enemyDamage)
                println("HP ${hero.name} tersisa: ${hero.hp}")
            }
            println("--- --- ---")
        } else if (choice == 2) {
            println("${hero.name} Kabur dari pertarungan!")
            break
        } else {
            println("ERROR: giliran terlewat. Pilihan tidak Valid!")
        }
    }
    println("--- Hasil ---")
    if (hero.isAlive() && enemyHp == 0) {
        println("Congrats! ${hero.name} Menang!")
    } else if (!hero.isAlive()) {
        println("${hero.name} Kalah!")
    } else {
        println("Draw")
    }
}