package UTS_165494_DariusEmmanuelEudiaHariman

class CateringOrder(val customer: Customer) {
    var status: OrderStatus = OrderStatus.WAITING_LIST
    private val orderItems: MutableList<Pair<CateringMenu, Int>> = mutableListOf()

    fun addMenuToOrder(menu: CateringMenu, Quantity: Int) {
        orderItems.add(Pair(menu, Quantity))
    }

    fun printInvoice() {
        println("================ INVOICE ================")
        println("Customer: ${customer.name} (${customer.phone})")
        println("Delivery Address: ${customer.deliveryAddress}")
        println("Order Status: $status")
        println()

        var grandTotal = 0.0
        for ((index, itemPair) in orderItems.withIndex()) {
            val menu = itemPair.first
            val quantity = itemPair.second
            val subtotal = menu.calculateSubtotal(quantity)
            grandTotal += subtotal

            print("${index + 1}. ")
            menu.printMenuDetails(quantity)
            println()
        }

        println("GRAND TOTAL: Rp ${String.format("%,.0f", grandTotal).replace(',', '.')}")
        println("=========================================")
    }
}