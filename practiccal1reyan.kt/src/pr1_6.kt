fun arithmeticOperations(a: Double, b: Double) {
    println("Addition: ${a + b}")
    println("Subtraction: ${a - b}")
    println("Multiplication: ${a * b}")

    if (b != 0.0) {
        println("Division: ${a / b}")
    } else {
        println("Division is not possible (cannot divide by zero)")
    }
}

fun main() {
    println("Enter first number:")
    val num1 = readln().toDouble()

    println("Enter second number:")
    val num2 = readln().toDouble()

    arithmeticOperations(num1, num2)
}