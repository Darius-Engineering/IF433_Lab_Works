package oop_00000165494_dariusemmanueleudiahariman.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable{
    override fun turnOn() {
        println("Smart Speaker '$name' turned on")
    }
    override fun turnOff() {
        println("Smart Speaker '$name' turned off")
    }
    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify")
    }
}