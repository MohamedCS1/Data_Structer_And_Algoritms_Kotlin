package Stack_Dynamic_Array

class Stack_Dynamic_Array(size:Int) {
    var Top:Int = -1

    var array = arrayOfNulls<String>(size)

    fun Push(element:String)
    {
        ensureCapacity(Top+1)
        Top++
        array[Top] = element
    }
    fun Pop():String
    {
        if (isEmpty())
        {
            return println("The Stack is Empty").toString()
        }

        ensureCapacity(Top+1)

        return println(array[Top--]).toString()
    }
    fun isEmpty():Boolean
    {
        if (Top == -1)
        {
            return true
        }
        return false
    }
    fun Print_size()
    {
        return println(array.size)
    }

    fun ensureCapacity(minCapacity:Int)
    {
        var oldCapacity:Int = array.size
        if (minCapacity >= oldCapacity)
        {
            var newCapacity:Int = oldCapacity * 2
            if (newCapacity < minCapacity) // Delete
            {
                newCapacity = minCapacity
            }
            array = array.copyOf(newCapacity)
        }
    }
    fun Display()
    {
        for (i in 0..array.size-1)
        {
            if (isEmpty())
            {
                return println("The Stack is Empty")
            }
            println(array[Top--])
        }
    }
}