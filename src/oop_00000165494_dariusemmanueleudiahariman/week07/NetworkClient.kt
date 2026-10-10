package oop_00000165494_dariusemmanueleudiahariman.week07

class NetworkClient private constructor(val url: String) {
    fun connect(){
        println("Connecting to $url...")
    }
}