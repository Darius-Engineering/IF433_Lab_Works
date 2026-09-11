package oop_00000165494_dariusemmanueleudiahariman.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- Sistem Denda Perpustakaan ---")
    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam: ")
    var loanDuration = scanner.nextInt()

    scanner.nextLine()

    if (loanDuration < 0) {
        println("ERROR: Diubah menjadi 1 hari. Lama pinjam tidak boleh minus!")
        loanDuration = 1
    }

    val loan = Loan(bookTitle, borrower, loanDuration)

    println("--- Detail Peminjaman ---")
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration}")
    println("Total Denda: Rp. ${loan.calculateFine()}")
}