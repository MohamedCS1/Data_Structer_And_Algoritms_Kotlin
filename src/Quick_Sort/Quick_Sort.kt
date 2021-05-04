package Quick_Sort

import Heap_Sort.Heap_Sort
import java.util.*

fun Quick_Sort(Array:Array<Int> , LowIndex:Int , HighIndex:Int)
{
    val Midlle:Int = LowIndex + (HighIndex - LowIndex) / 2
    var i:Int = LowIndex
    var j:Int = HighIndex
    val Pivot:Int = Array[Midlle]
    if (LowIndex >= HighIndex)
    {
        return
    }
    while (i <= j)
    {
          while (Array[i] < Pivot)
          {
              i++
          }
          while (Array[j] > Pivot)
          {
              j--
          }
          if (i <= j)
          {
              // Swap
              val Temp:Int = Array[i]
              Array[i] = Array[j]
              Array[j] = Temp
              i++
              j--
          }
    }
    if (LowIndex < i)
    {
        Quick_Sort(Array,LowIndex,j)
    }
    if (HighIndex > j)
    {
        Quick_Sort(Array,i,HighIndex)
    }

}

fun main() {
    val ArrayofNumber = arrayOf<Int>(88,22,11,4,45,11,-6,-11,22,7,4,3)

    for (i in  0..ArrayofNumber.size-1)
    {
        print("${ArrayofNumber[i]}   ")
    }
    print("\n")
    println("-------------------------After-------------------------")
    Quick_Sort(ArrayofNumber,0,ArrayofNumber.size-1)
    for (i in  0..ArrayofNumber.size-1)
    {
        print("${ArrayofNumber[i]}   ")
    }
}