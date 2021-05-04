package Simple_Array

fun main() {
    var ArrayofName = arrayOfNulls<String>(5)
    ArrayofName[0] = "Yassin"
    ArrayofName[1] = "Mohamed"
    ArrayofName[2] = "Samir"
    ArrayofName[3] = "Nassim"
    ArrayofName[4] = "Anis"


    for (i in 0..ArrayofName.size-1)
    {
        println(ArrayofName[i])
    }
}