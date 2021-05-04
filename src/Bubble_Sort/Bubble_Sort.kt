package Bubble_Sort

fun main() {

    var ArrayofNumber = arrayOf<Int>(11,34,3,56,7,89,19,4,45,67)
    for (i in 0..ArrayofNumber.size-1)
    {
        print("${ArrayofNumber[i]}   ")
    }

    var temp:Int = 0

    for (i in 0..ArrayofNumber.size-1)
    {
        for (j in 1..ArrayofNumber.size-1-i)
        {
            if (ArrayofNumber[j-1] > ArrayofNumber[j])
            {
                temp = ArrayofNumber[j]
                ArrayofNumber[j] = ArrayofNumber[j-1]
                ArrayofNumber[j-1] = temp

            }
        }
    }
    println("\n")
    println("--------------------After--------------------")
    print("\n")
    for (i in 0..ArrayofNumber.size-1)
    {
        print("${ArrayofNumber[i]}   ")
    }
}