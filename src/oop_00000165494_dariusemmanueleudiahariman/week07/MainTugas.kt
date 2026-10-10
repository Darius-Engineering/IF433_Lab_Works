package oop_00000165494_dariusemmanueleudiahariman.week07

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("Legendary Item DropChance: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println("StarterWeapon: name = ${starterWeapon.item.name}, damage = ${starterWeapon.item.damage}, Rarity = ${starterWeapon.item.rarity}, Durability = ${starterWeapon.durability}")
}