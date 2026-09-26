package oop_00000165494_dariusemmanueleudiahariman.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPengawai: List<Pengawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pengawai in daftarPengawai) {
        pengawai.bekerja()
        //pengawai.mengajar() //INI AKAN ERROR karena tipe referensi adalah Pengawai

        when (pengawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pengawai.nidn})")
                pengawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pengawai.doAdminWork()
            }
        }
        println("-------------------------")
    }
}