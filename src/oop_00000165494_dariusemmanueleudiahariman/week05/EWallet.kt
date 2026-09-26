package oop_00000165494_dariusemmanueleudiahariman.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(Amount: Double) {
        if (balance >= Amount) {
            balance -= Amount
            println("Sukses")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(Amount: Double) {
        balance += Amount
        println("Top up berhasil")
    }
}