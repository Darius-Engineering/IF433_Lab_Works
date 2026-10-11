package UTS_165494_DariusEmmanuelEudiaHariman

class FoodMenu(name: String, menuCode: String, basePrice: Double) : CateringMenu(name, menuCode, basePrice){
    val packagingFee: Double = 3000.0

    override fun calculateSubtotal(quantity: Int): Double {
        return (basePrice + packagingFee) * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val subtotal = calculateSubtotal(quantity)
        println("[FOOD] $menuCode - $name")
        println("Qty: $quantity portions | Subtotal: Rp ${String.format("%,.0f", subtotal).replace(',', '.')}")
    }
}