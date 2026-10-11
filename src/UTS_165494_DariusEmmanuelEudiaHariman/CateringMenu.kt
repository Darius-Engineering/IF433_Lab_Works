package UTS_165494_DariusEmmanuelEudiaHariman

interface IBillable {
    fun calculateSubtotal(quantity: Int): Double
    fun printMenuDetails(quantity: Int)
}

abstract class CateringMenu(val name: String, initialMenuCode: String, initialPrice: Double) : IBillable {
    var menuCode: String = initialMenuCode
        get() = "UMN-$field"
        set(value) {
            field = value.uppercase()
        }

    var basePrice: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("[Error] Invalid price!")
            }
        }

    init {
        this.basePrice = initialPrice
    }
}