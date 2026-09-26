package oop_00000165494_dariusemmanueleudiahariman.week05

class CreditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(accountName) {
    override fun processPayment(Amount: Double) {
        if (usedAmount + Amount < limit) {
            usedAmount += Amount
            println("Sukses")
        } else {
            print("Transaksi Ditolak")
        }
    }
}