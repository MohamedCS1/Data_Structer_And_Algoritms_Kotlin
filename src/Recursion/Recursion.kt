package Recursion

fun main() {

    fun Dubly_Number(number: Int) {

        if (number == 1073741824) {
            return
        }

        Dubly_Number(number * 2)

        println(number)

    }

    val number = 5
    var result: Long

    fun Factorial(Number: Int): Long {
        if (Number == 1) {
            return Number.toLong()
        }

       return Number * Factorial(Number - 1)
    }

    Dubly_Number(2)

    println("-------------------------------")
    println()
    result = Factorial(5)
    println("Factorial of $number = $result")
}