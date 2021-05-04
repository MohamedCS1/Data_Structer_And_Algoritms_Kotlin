package Selection_Sort

fun main() {

    val ArrayofNumber = arrayListOf<Int>(76,-55,34,11,23,345,-22,124,3456,55,34,23,1,-88,22,11)

    for (i in  0..ArrayofNumber.size-1)
    {
        print("${ArrayofNumber[i]}   ")
    }

    var temp:Int? = null
    var smNumber:Int? = null
    var counter = 0
    var rank = 0
    for (i in 0..ArrayofNumber.size-1)
    {
        smNumber = ArrayofNumber[i]
        for (j in counter..ArrayofNumber.size-1)
        {
            if (ArrayofNumber[j] <= smNumber!!)
            {
                smNumber = ArrayofNumber[j]
                rank = j
            }

        }
        temp = ArrayofNumber[i]
        ArrayofNumber[i] = smNumber!!
        ArrayofNumber[rank] = temp
        counter++
    }

    print("\n")
    println("---------------------------------------after---------------------------------------")
    for (i in  0..ArrayofNumber.size-1)
    {
        print("${ArrayofNumber[i]}   ")
    }

}
