package oop_00000165494_dariusemmanueleudiahariman.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Smart Lamp '$name' turned on, emitting light")
    }

    override fun turnOff() {
        println("Smart Lamp '$name' turned off, no light emitted")
    }
}