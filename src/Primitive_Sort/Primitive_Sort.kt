package Primitive_Sort

fun main() {
    val ArrayofNumber = arrayListOf<Int>(76,55,34,11,23,345,22,124,3456,55,34,23,1,88,22,11)

    for (i in  0..ArrayofNumber.size-1)
    {
        print("${ArrayofNumber[i]}   ")
    }

    val arr = IntArray(ArrayofNumber.size)
    var smNumber:Int? = null
    for (i in 0..ArrayofNumber.size-1)
    {
        smNumber = ArrayofNumber[0]
        for (j in 0..ArrayofNumber.size-1)
        {
            if (ArrayofNumber[j] <= smNumber!!)
            {
                smNumber = ArrayofNumber[j]
            }

        }
        arr[i] = smNumber!!
        for (j in 0..ArrayofNumber.size-1)
        {
            if (ArrayofNumber[j] == smNumber)
            {
                ArrayofNumber.removeAt(j)
                break
            }
        }
    }

    print("\n")
    println("------------------after------------------")
    for (i in  0..arr.size-1)
    {
        print("${arr[i]}   ")
    }

}