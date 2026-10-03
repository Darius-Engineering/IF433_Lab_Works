package oop_00000165494_dariusemmanueleudiahariman.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice){
        devices.add(device)
        println("Device '${device.name}' is successfully added")
    }
    fun turnOffAllSwitches(){
        for (device in devices) {
            if (device is Switchable){
                device.turnOff()
            }
        }
    }
}