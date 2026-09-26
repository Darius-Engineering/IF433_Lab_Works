package oop_00000165494_dariusemmanueleudiahariman.week05

class Dosen(name: String, val nidn: String) : Pegawai(name){
    override fun bekerja() {
        println("[$name] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    fun mengajar() {
        println("[$name] sedang mengajar mahasiswa di kelas.")
    }
}