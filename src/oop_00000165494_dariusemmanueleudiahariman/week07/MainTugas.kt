package oop_00000165494_dariusemmanueleudiahariman.week07

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("Legendary Item DropChance: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println("StarterWeapon: name = ${starterWeapon.item.name}, damage = ${starterWeapon.item.damage}, Rarity = ${starterWeapon.item.rarity}, Durability = ${starterWeapon.durability}")

    val upgradedSwordItem = starterWeapon.item.copy(damage = 25)
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedSwordItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}