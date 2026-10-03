package oop_00000165494_dariusemmanueleudiahariman.week06

fun main() {
    val myLamp = SmartLamp("L1", "Ruang Tamu")
    val mySpeaker = SmartSpeaker("S1", "Google Nest Dapur")
    val myCCTV = SmartCCTV("C1", "Ezviz Garasi")

    val hub = SmartHomeHub()
    println("=== TESTING ADD DEVICE ===")
    hub.addDevice(myLamp)
    hub.addDevice(mySpeaker)
    hub.addDevice(myCCTV)
    println("\n=== TESTING SECURITY MODE ===")
    hub.activateSecurityMode()
    println("\n=== TESTING SHUTDOWN ===")
    hub.turnOffAllSwitches()
}