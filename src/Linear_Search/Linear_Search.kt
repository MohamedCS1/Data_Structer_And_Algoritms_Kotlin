package Linear_Search

import java.lang.Exception

fun main() {
    var full:Int = 1
    var ArrayofNumber = arrayOfNulls<Int>(1000000)
    for (i in 0..ArrayofNumber.size-1)
    {
        ArrayofNumber[i] = full++
    }

    var SearchNumber:Int? = null
    while (true)
    {
       print("Enter Number for Search ----> ")

        SearchNumber = try {
            readLine()!!.toInt()

        }catch (ex:Exception){continue}
        if (SearchNumber <= 0 || SearchNumber > 1000000)
        {
            continue
        }
        print("\n")
        break
    }
    var Try:Int = 0
    for (i in 0..ArrayofNumber.size-1)
    {
        Try++
        if (ArrayofNumber[i] == SearchNumber)
        {
            println("Number Find\n")
            println("Number Find After ${Try} Try")
        }

    }
}