package oop_00000165494_dariusemmanueleudiahariman.week05

class Admin(name: String) : Pengawai(name) {
    override fun bekerja() {
        println("[$name] sedang duduk di depan komputer melayani administrasi.")
    }

    fun doAdminWork() {
        println("[$name] sedang merekap data absensi mahasiswa.")
    }
}