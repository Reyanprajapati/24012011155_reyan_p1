fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}

fun main() {
    println("Enter a number:")
    val num = readln().toInt()

    if (num >= 0) {
        println("Factorial of $num is ${factorial(num)}")
    } else {
        println("Factorial is not defined for negative numbers")
    }
}