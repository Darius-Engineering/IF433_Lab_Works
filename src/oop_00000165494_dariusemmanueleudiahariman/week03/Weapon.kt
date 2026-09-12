package oop_00000165494_dariusemmanueleudiahariman.week03

class Weapon (val name: String){
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Damage can't be negative!")
                field = 0
            } else if (value > 1000) {
                println("ERROR: Damage can't be more than 1000 (overpowered) | Damage set to 1000")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}