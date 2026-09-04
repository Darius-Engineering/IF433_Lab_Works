package oop_00000165494_dariusemmanueleudiahariman.week01

fun main(){
    val gameTitle = "Elden Ring"
    val price = 599000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    println("Price: $price")
    printReceipt(title = gameTitle, finalPrice = finalPrice)

    val userNote: String? = null
    println("Catatan: ${userNote ?: "Tidak ada catatan"}")
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, finalPrice: Int){
    println("Game Title = $title")
    println("Final Price = Rp. $finalPrice")
}