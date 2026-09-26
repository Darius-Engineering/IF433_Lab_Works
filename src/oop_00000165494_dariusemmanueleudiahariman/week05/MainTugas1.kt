package oop_00000165494_dariusemmanueleudiahariman.week05

fun main() {
    val math = MathHelper()

    println("=== Testing MathHelper Overloading in Main ===")
    val lP = math.hitungLuas(5)
    println("Luas Persegi: $lP")

    val lPP = math.hitungLuas(5, 8)
    println("Luas Persegi Panjang: $lPP")

    val lL = math.hitungLuas(5.0)
    println("Luas Lingkaran: $lL")
}