package Dynamic_Array

class Dynamc_Array{

    var size:Int = 0

    var Array = arrayOfNulls<Int>(size)




    fun Get(index:Int)
    {
        if (index > Array.size-1)
        {
            return println("This Index Outside the Array ")
        }
       return println(Array[index])
    }
    fun PrintSize()
    {
        return println(Array.size)
    }

    fun Put(Element:Int)
    {
        ensureCapacity(size+1)
        Array[size++] = Element
    }

    fun ensureCapacity(minCapacity:Int)
    {
        var oldCapacity:Int = Array.size
        if (minCapacity >= oldCapacity)
        {
            var newCapacity:Int = oldCapacity * 2
            if (newCapacity < minCapacity) // Delete
            {
                newCapacity = minCapacity
            }
            Array = Array.copyOf(newCapacity)
        }
    }


}