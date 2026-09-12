package oop_00000165494_dariusemmanueleudiahariman.week03

class Player(
    val username: String
) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXP(amount: Int){
        if (amount <= 0) return
        val lvl = level
        xp += amount
        if (lvl < level) {
            println("Level Up! Selamat $username naik ke level $level")
        }
    }
}