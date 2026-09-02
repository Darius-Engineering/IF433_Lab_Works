package oop_00000165494_dariusemmanueleudiahariman.week01

fun main() {
    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")

    println(checksize(area))
}

fun checksize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"