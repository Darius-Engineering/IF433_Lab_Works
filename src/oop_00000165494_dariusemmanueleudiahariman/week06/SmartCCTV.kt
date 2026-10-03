package oop_00000165494_dariusemmanueleudiahariman.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOff() {
        println("Smart CCTV '$name' turned off")
        stopRecord()
    }

    override fun turnOn() {
        println("Smart CCTV '$name' turned on")
        startRecord()
    }

    override fun startRecord() {
        println("Starting recording")
    }
}