class Car(
    val type: String,
    val model: String,
    val price: Double,
    val owner: String,
    val milesDriven: Int
) {

    // Function to get car information
    fun getCarInformation() {
        println("Car Type: $type")
        println("Model: $model")
        println("Owner: $owner")
        println("Miles Driven: $milesDriven")
    }

    // Function to get original car price
    fun getOriginalPrice(): Double {
        return price
    }

    // Function to calculate current car price
    fun getCurrentPrice(): Double {
        val depreciation = milesDriven * 0.05
        return price - depreciation
    }

    // Function to display all car information
    fun displayCarInformation() {
        println("\n--- Car Information ---")
        getCarInformation()
        println("Original Price: $${getOriginalPrice()}")
        println("Current Price: $${getCurrentPrice()}")
    }
}

fun main() {

    // Creating object using constructor
    val car1 = Car(
        "SUV",
        "Toyota Fortuner",
        40000.0,
        "Rahul",
        50000
    )

    car1.displayCarInformation()
}