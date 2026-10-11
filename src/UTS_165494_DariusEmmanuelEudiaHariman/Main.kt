package UTS_165494_DariusEmmanuelEudiaHariman

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("=== UMN CATERING MANAGER SYSTEM ===")
    println("[Database Setup] Adding Nasi Goreng Spesial...")
    val menu1 = FoodMenu("Nasi Goreng Spesial", "nsg01", 0.0)
    menu1.basePrice = -15000.0 // Triggers error message
    menu1.basePrice = 25000.0
    println("[Database Setup] Price updated to Rp 25.000")

    val menu2 = FoodMenu("Ayam Bakar Madu", "aym02", 35000.0)
    val menu3 = DrinkMenu("Es Teh Lemon", "lem01", 8000.0, true)
    val menuCatalog = listOf<CateringMenu>(menu1, menu2, menu3)

    println("\n--- CUSTOMER DATA INPUT ---")
    print("Enter Customer Name: ")
    val custName = scanner.nextLine()

    print("Enter Phone Number: ")
    val phone = scanner.nextLine()

    print("Enter Delivery Address: ")
    val address = scanner.nextLine()
    val customer = Customer(custName, phone, address)
    val order = CateringOrder(customer)

    while (true) {
        println("\nMENU CATALOG")
        for ((index, menu) in menuCatalog.withIndex()) {
            println("${index + 1}.${menu.name}")
        }
        println("0. [FINISH & CHECKOUT]")

        print("Select Menu Number: ")
        val choice = scanner.nextInt()

        if (choice == 0) {
            println("Processing Checkout...")
            break
        }

        if (choice in 1..menuCatalog.size) {
            print("Enter Quantity: ")
            val qty = scanner.nextInt()
            order.addMenuToOrder(menuCatalog[choice - 1], qty)
            println("Order successfully added!")
        } else {
            println("[Error] Invalid menu number!")
        }
    }
    order.status = OrderStatus.COOKING
    println()
    order.printInvoice()
}