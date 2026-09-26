package oop_00000165494_dariusemmanueleudiahariman.week05

fun main() {
    val eWallet = EWallet("Elon Musk", 50000.0)
    val creditCard = CreditCard("Elon Musk", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (payment in paymentMethods) {
        payment.processPayment(75000.0)

        when (payment) {
            is EWallet -> {
                payment.topUp(50000.0)
                payment.processPayment(75000.0)
            }
        }
    }
}