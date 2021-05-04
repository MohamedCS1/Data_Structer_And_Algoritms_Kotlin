package Heap_Sort

fun Heap_Sort(Array:Array<Int>,s:Int)
{
    Build_Heap(Array,s)
    for (i in s downTo (0))
    {
        // Swap between index 0 and Last Index and application Hepify
        val Temp:Int = Array[0]
        Array[0] = Array[i]
        Array[i] = Temp
        Heapfiy(Array,i,0)
    }
}
fun Build_Heap(Array: Array<Int>, s: Int)
{
    // Creates a Max Heap
    for (i in s / 2 downTo (0))
    {
        Heapfiy(Array, s, /* Position */ i)
    }
}
fun Heapfiy(Array: Array<Int>, s: Int, p : Int)
{
    val Left:Int = (p * 2) + 1
    val Right:Int = (p * 2) + 2
    var Max:Int = p  // We Consider it By Defult The Location we Are One

    if (Left < s && Array[Left] > Array[Max])
    {
        Max = Left
    }

    if (Right < s && Array[Right] > Array[Max])
    {
        Max = Right
    }

    if (Max != p)
    {
      //Swap between  p and New Max and application Hepifay for Max
        val Temp:Int = Array[p]
        Array[p] = Array[Max]
        Array[Max] = Temp
        Heapfiy(Array,s,Max)
    }
}
fun main() {
    val ArrayofNumber = arrayOf<Int>(76,55,34,11,23,345,22,-11,-34,0,-45,-13-64,124,3456,55,34,23,1,88,22,11)

    for (i in  0..ArrayofNumber.size-1)
    {
        print("${ArrayofNumber[i]}   ")
    }
    print("\n")
    println("----------------------------------------------------After----------------------------------------------------")
    Heap_Sort(ArrayofNumber,ArrayofNumber.size-1)
    for (i in  0..ArrayofNumber.size-1)
    {
        print("${ArrayofNumber[i]}   ")
    }
}