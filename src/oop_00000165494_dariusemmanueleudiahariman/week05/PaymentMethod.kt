package oop_00000165494_dariusemmanueleudiahariman.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(Amount: Double)
}