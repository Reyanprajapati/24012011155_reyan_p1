fun findMaximum(numbers: ArrayList<Int>): Int {
    var max = numbers[0]

    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }

    return max
}

fun main() {
    val numbers = ArrayList<Int>()

    println("Enter the number of elements:")
    val n = readln().toInt()

    println("Enter $n numbers:")

    for (i in 1..n) {
        numbers.add(readln().toInt())
    }

    val maximum = findMaximum(numbers)

    println("Maximum number is: $maximum")
}