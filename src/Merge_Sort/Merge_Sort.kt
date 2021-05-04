package Merge_Sort
fun Merge_Sort(Array:Array<Int>,LeftIndex:Int,RightIndex:Int)
{
    if(LeftIndex < RightIndex)
    {
        var Middle:Int = LeftIndex + (RightIndex - LeftIndex) / 2
        Merge_Sort(Array,LeftIndex,Middle)
        Merge_Sort(Array,Middle+1,RightIndex)
        Merge(Array,LeftIndex,Middle,RightIndex)
    }
}

fun Merge(Array: Array<Int>, LeftIndex: Int, Middle:Int, RightIndex: Int)
{

    val ArrayLeft = IntArray(Middle + 1 - LeftIndex)
    val ArrayRight = IntArray(RightIndex - Middle)

    for (i in 0..ArrayLeft.size-1)
    {
        ArrayLeft[i] = Array[LeftIndex + i]
    }
    for (j in 0..ArrayRight.size-1)
    {
        ArrayRight[j] = Array[Middle + 1 + j]
    }

    var i:Int = 0
    var j:Int = 0
    var k:Int = LeftIndex

    while (i < ArrayLeft.size && j < ArrayRight.size)
    {
        if (ArrayLeft[i] <= ArrayRight[j])
        {
            Array[k] = ArrayLeft[i]
            i++
            k++
        }
        else
        {
            Array[k] = ArrayRight[j]
            j++
            k++
        }

    }

    while (i < ArrayLeft.size)
    {
        Array[k++] = ArrayLeft[i++]
    }

    while (j < ArrayRight.size)
    {
        Array[k++] = ArrayRight[j++]
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
    Merge_Sort(ArrayofNumber,0,ArrayofNumber.size-1)
    for (i in  0..ArrayofNumber.size-1)
    {
        print("${ArrayofNumber[i]}   ")
    }

}
