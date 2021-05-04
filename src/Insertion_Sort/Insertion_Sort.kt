package Insertion_Sort

fun main() {

    var ArrayOfNumber = arrayOf<Int>(22, 44, 11, 23, 55, 21, 65, 21, 3, 45)
    for (i in 0..ArrayOfNumber.size - 1) {
        print("${ArrayOfNumber[i]}  ")
    }

    var box:Int  = 0
    var count:Int = 0
    for (i in 1..ArrayOfNumber.size-1)
    {
        count = i - 1
        box = ArrayOfNumber[i]

        while (count >= 0 && ArrayOfNumber[count] > box)
        {
            ArrayOfNumber[count + 1] = ArrayOfNumber[count]
            count--
        }
        ArrayOfNumber[count + 1] = box

    
    }
    print("\n")
    println("----------------After----------------")

    for (i in 0..ArrayOfNumber.size -1)
    {
        print("${ArrayOfNumber[i]}  ")
    }
}