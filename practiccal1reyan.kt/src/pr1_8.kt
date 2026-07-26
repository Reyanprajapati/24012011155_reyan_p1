import java.util.Scanner

fun main() {
    val array1 = arrayOf(10, 90, 60, 80, 100)
    println(array1.contentToString())

    val array2 = Array<Int>(5) { 0 }
    println(array2.contentToString())

    val array3 = Array<Int>(8) { index -> index }
    println(array3.contentDeepToString())

    val array4 = IntArray(5)
    println(array4.joinToString())

    val array5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println(array5.joinToString())

    val array6 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println(array6.contentDeepToString())

    val scanner = Scanner(System.`in`)
    val a = IntArray(5)

    println("Please enter Array Value:")
    for (i in a.indices) {
        print("a[$i]=")
        a[i] = scanner.nextInt()
    }

    println("Entered Array:")
    println(a.contentToString())

    println("*************With Built-in Function*************")

    a.sort()

    println("After sorting by built-in function:")
    println(a.joinToString())

    val b = intArrayOf(56, 23, 49, 12, 2)

    println("\n*************Without Built-in Function*************")
    println("Before Sorting:")
    println(b.joinToString())

    for (i in 0 until b.size - 1) {
        for (j in 0 until b.size - i - 1) {

            if (b[j] > b[j + 1]) {
                val temp = b[j]
                b[j] = b[j + 1]
                b[j + 1] = temp
            }
        }
    }

    println("\nAfter Sorting without built-in function:")
    println(b.joinToString())
}