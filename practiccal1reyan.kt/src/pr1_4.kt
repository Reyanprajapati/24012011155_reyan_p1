fun main() {
    println("Enter the Number:")
    val number = readlnOrNull()?.toIntOrNull()

    if (number != null) {
        println(
            if (number % 2 == 0)
                "even"
            else
                "odd"
        )
    } else {
        println("Please enter a valid number")
    }
}