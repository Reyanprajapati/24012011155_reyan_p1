# Practical-1: Kotlin Programming Concepts

This practical demonstrates fundamental Kotlin programming concepts
through a collection of small programs. It covers variables and data
types, type conversion, user input, control flow, functions, recursion,
arrays, collections, classes, constructors, operator overloading, and
matrix operations.

## Requirements

-   Kotlin compiler / Kotlin JVM
-   IntelliJ IDEA, Android Studio, or any Kotlin-compatible IDE
-   JDK installed and configured

## Practical Objectives

The objectives of this practical are to:

1.  Understand Kotlin variables and basic data types.
2.  Perform type conversion in Kotlin.
3.  Accept and display student information.
4.  Use conditional expressions to check odd/even numbers.
5.  Use `when` expressions for decision making.
6.  Create and use user-defined functions.
7.  Implement recursion for factorial calculation.
8.  Work with arrays, loops, and sorting.
9.  Find the maximum value in an `ArrayList`.
10. Create classes, constructors, properties, and member functions.
11. Understand operator overloading and implement matrix operations.

## Programs Covered

### 1.1 Store & Display Values in Different Variables

Demonstrates the following Kotlin data types:

-   `Int`
-   `Double`
-   `Float`
-   `Long`
-   `Short`
-   `Byte`
-   `Char`
-   `Boolean`
-   `String`

### 1.2 Type Conversion

Demonstrates:

-   Integer to Double
-   String to Integer
-   String to Double

Common Kotlin conversion functions include:

``` kotlin
toDouble()
toInt()
toFloat()
toLong()
```

### 1.3 Student Information

Accepts and displays student details such as:

-   Name
-   Enrolment number
-   Branch
-   Semester
-   College
-   Age
-   Mobile number

### 1.4 Odd or Even Number

Uses the Kotlin `if-else` expression directly inside `println()` to
determine whether a number is odd or even.

### 1.5 Display Month Name

Uses a `when` expression to convert a month number from 1--12 into its
corresponding month name.

### 1.6 User-Defined Function

Creates a function to perform:

-   Addition
-   Subtraction
-   Multiplication
-   Division

The program also handles division by zero.

### 1.7 Factorial Using Recursion

Calculates the factorial of a non-negative integer using a recursive
function.

For example:

``` text
5! = 5 × 4 × 3 × 2 × 1 = 120
```

### 1.8 Working with Arrays

Demonstrates:

-   `IntArray`
-   `Array`
-   `Arrays.deepToString()`
-   `contentDeepToString()`
-   `joinToString()`
-   `range`
-   `until`
-   `downTo`
-   Manual bubble sort
-   Built-in `sort()`

### 1.9 Maximum Number from ArrayList

Stores integers in an `ArrayList<Int>` and determines the maximum value
using iteration.

### 1.10 Class and Constructor

Defines a `Car` class with properties:

-   Type
-   Model
-   Price
-   Owner
-   Miles driven

The class includes functions for:

-   Getting car information
-   Getting original car price
-   Calculating current car price
-   Displaying complete car information

### 1.11 Operator Overloading and Matrix Operations

Defines a `Matrix` class and overloads:

-   `+` for matrix addition
-   `-` for matrix subtraction
-   `*` for matrix multiplication
-   `toString()` for customized matrix display

Example:

``` kotlin
matrix1 + matrix2
matrix1 - matrix2
matrix1 * matrix2
```

## Project Structure

A recommended structure is:

``` text
Practical-1/
│
├── README.md
│
├── 1.1_DataTypes.kt
├── 1.2_TypeConversion.kt
├── 1.3_StudentInformation.kt
├── 1.4_OddEven.kt
├── 1.5_MonthName.kt
├── 1.6_ArithmeticFunctions.kt
├── 1.7_FactorialRecursion.kt
├── 1.8_Arrays.kt
├── 1.9_ArrayListMaximum.kt
├── 1.10_CarClass.kt
└── 1.11_MatrixOperatorOverloading.kt
```

## How to Run

### Using IntelliJ IDEA

1.  Open IntelliJ IDEA.
2.  Create or open a Kotlin/JVM project.
3.  Add the `.kt` files to the project.
4.  Open the required Kotlin file.
5.  Click the **Run** button next to the `main()` function.
6.  Enter input in the Run console where required.

### Using Kotlin Command Line

Compile a Kotlin file:

``` bash
kotlinc 1.1_DataTypes.kt -include-runtime -d program.jar
```

Run the generated JAR:

``` bash
java -jar program.jar
```

Repeat the process for the required practical file.

## Important Kotlin Concepts

### Variables

Kotlin supports immutable and mutable variables:

``` kotlin
val name = "Kotlin"
var age = 20
```

`val` is used for read-only references, while `var` allows reassignment.

### Conditional Expression

`if` can return a value:

``` kotlin
val result = if (number % 2 == 0) "Even" else "Odd"
```

### When Expression

`when` is Kotlin's convenient multi-branch conditional expression:

``` kotlin
val result = when (month) {
    1 -> "January"
    2 -> "February"
    else -> "Invalid"
}
```

### Functions

A Kotlin function is declared using `fun`:

``` kotlin
fun add(a: Int, b: Int): Int {
    return a + b
}
```

### Recursion

A recursive function calls itself until a base condition is reached.

### Classes

A Kotlin class can define properties and functions:

``` kotlin
class Car(val model: String, val price: Double)
```

### Operator Overloading

Kotlin allows operators to be customized for user-defined types using
functions such as:

``` kotlin
operator fun plus(other: Matrix): Matrix
```

## Expected Learning Outcomes

After completing this practical, students should be able to:

-   Declare and use Kotlin variables.
-   Identify and work with common Kotlin data types.
-   Convert values between compatible types.
-   Read data from the console.
-   Use `if`, `when`, and loops.
-   Define and call functions.
-   Understand recursion.
-   Manipulate arrays and collections.
-   Sort arrays manually and using built-in functions.
-   Create classes and constructors.
-   Implement member functions.
-   Understand operator overloading.
-   Implement basic matrix arithmetic.

## Notes

-   Kotlin does not automatically convert numeric types such as `Int` to
    `Double`; explicit conversion is required.
-   `readLine()!!` assumes that input is available. For production
    applications, safer input handling is recommended.
-   Matrix addition and subtraction require matrices with matching
    dimensions.
-   Matrix multiplication requires the number of columns in the first
    matrix to equal the number of rows in the second matrix.
-   The car current-price calculation in this practical uses an example
    depreciation rule and can be modified according to the requirements
    of the assignment.

## Conclusion

This practical provides a foundation in Kotlin programming by combining
basic syntax with object-oriented programming concepts. The programs
progressively introduce variables, input/output, control flow,
functions, recursion, arrays, collections, classes, constructors,
operator overloading, and matrix operations.
