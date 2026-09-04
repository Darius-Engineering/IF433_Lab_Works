package oop_00000165494_dariusemmanueleudiahariman.week01

fun main(){
    val gameTitle = "Elden Ring"
    val price = 599000
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()