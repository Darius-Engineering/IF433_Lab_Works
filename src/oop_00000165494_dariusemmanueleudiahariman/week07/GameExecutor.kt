package oop_00000165494_dariusemmanueleudiahariman.week07

fun processEvent(event: BattleState){
    when (event){
        is BattleState.MonsterEncounter -> println("Monster Encountered: ${event.monsterName}")
        is BattleState.LootDropped -> {
            val (itemName, itemDamage, itemRarity) = event.item
            println("Item Found! : $itemName (damage: $itemDamage, rarity: $itemRarity)")
        }
        is BattleState.GameOver -> println("YOU DIED: ${event.reason}")
        is BattleState.SafeZone -> println("You're Safe now (In a Safezone)")
    }
}