package oop_00000165494_dariusemmanueleudiahariman.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) {"API Invalid: Missing ID"}
        val name = requireNotNull(rawJson["name"] as? String) {"API Invalid: Missing Name"}
        return when (rawJson["type"] as? String) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Product.Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Product.Clothing(id, name, size)
            } else -> null
        }
    }
}