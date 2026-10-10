    package oop_00000165494_dariusemmanueleudiahariman.week07

    class Weapon private constructor(val item: GameItem, val durability: Int){
        companion object{
            fun forgeStarterSword(): Weapon{
                return Weapon(GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON), 50)
            }
            fun forgeEpicSword(): Weapon{
                return Weapon(GameItem("Super Epic Sword", 25, ItemRarity.EPIC), 100)
            }
        }
    }