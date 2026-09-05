package oop_00000165494_dariusemmanueleudiahariman.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- Aplikasi PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.nextLine()

    scanner.nextLine()

    if(nim.length != 5){
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
}