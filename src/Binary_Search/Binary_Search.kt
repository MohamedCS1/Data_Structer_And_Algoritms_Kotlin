package Binary_Search

import kotlin.system.exitProcess

fun main() {
    var full:Int = 1
    var ArrayOfNumber = arrayOfNulls<Int>(1000000)
    for (i in 0..ArrayOfNumber.size-1)
    {
        ArrayOfNumber[i] = full++
    }

    var SearchNumber:Int? = null
    while (true)
    {
        print("Enter Number for Search ----> ")
        SearchNumber = try {

            readLine()!!.toInt()

        }catch (Ex:Exception){continue}
        if (SearchNumber < 0 || SearchNumber > 1000000)
        {
            continue
        }
        print("\n")
        break

    }

    run {
        var Try:Int = 0
        var Low:Int = 0
        var Height:Int = ArrayOfNumber.size
        var run:Boolean = true
        if (SearchNumber == Low)
        {
            println("Number Find\n")
            println("Number Find After ${Try} Try")
            run = false

        }
        else if (SearchNumber == Height)
        {
            println("Number Find\n")
            println("Number Find After ${Try} Try")
            run = false
        }

        while (run == true)
        {
            Try++
            val Mid:Int = (Low + Height)/2
            if (SearchNumber == ArrayOfNumber[Mid])
            {
                println("Number Find\n")
                println("Number Find After ${Try} Try")
                break
            }
            if (SearchNumber!! > ArrayOfNumber[Mid]!!)
            {
                Low = Mid + 1
            }
            if (SearchNumber < ArrayOfNumber[Mid]!!)
            {
                Height = Mid - 1
            }
        }


    }
}