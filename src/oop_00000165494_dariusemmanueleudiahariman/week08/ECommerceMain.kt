package oop_00000165494_dariusemmanueleudiahariman.week08

fun main () {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "NotAn Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )
    val parser = ApiParser()
    println("=== E-COMMERCE BATCH PROCESSING ===")

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)
            product?.let {
                val productName = when (it) {
                    is Product.Electronic -> it.name
                    is Product.Clothing -> it.name
                }
                println("Berhasil diparsing: $productName")
                parser.checkout(it)
            } ?: println("Data dilewati: Tipe produk tidak dikenali.")
        } catch (e: IllegalArgumentException) {
            println("Gagal diparsing: ${e.message}")
        }
    }
}

//Main has been runned, output is as expected. Checkpoint 20 DONE