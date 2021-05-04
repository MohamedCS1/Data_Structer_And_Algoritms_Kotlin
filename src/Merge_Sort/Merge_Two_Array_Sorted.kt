package Merge_Sort



fun main() {
    val Array1 = arrayOf(11,13,23,24)
    val Array2= arrayOf(22,43,95,422,644,5431,134534,456412)
    val finalArray = IntArray(Array2.size + Array1.size)

    var i = 0
    var j = 0
    var k = 0
    while (i < Array2.size && j < Array1.size)
    {

        if (Array2[i] < Array1[j])
        {

            finalArray[k] = Array2[i]
            i++
            k++

        }
        else
        {
            finalArray[k] = Array1[j]
            j++
            k++
        }


    }
    while (i <= Array2.size-1)
    {
        finalArray[k++] = Array2[i++]
    }
    while (j <= Array1.size-1)
    {
        finalArray[k++] = Array1[j++]
    }

    for (g in 0..finalArray.size-1)
    {
        print("${finalArray[g]}   ")
    }



}
