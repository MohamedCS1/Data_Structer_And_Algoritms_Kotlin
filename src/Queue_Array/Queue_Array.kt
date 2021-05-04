package Queue_Array


class Queue_Array(size:Int) {
    var array = arrayOfNulls<String>(size)
    var Front:Int = -1
    var Rear:Int = -1

    fun Queue(element:String)
    {
        if (isFull())
        {
            return println("The Queue is Full")
        }
        Rear++
        array[Rear] = element

        if (Front == -1) // Only one Start
        {
            Front = 0
        }
    }

    fun DeQueue()
    {
        if (isEmpty())
        {
            return println("The Queue is Empty")
        }
        if (Front == 0)
        {
            println(array[Front])
        }
        try {
            Front++
            println(array[Front])
        }catch (ex:Exception){}

    }

    fun isEmpty():Boolean
    {
        if (Front > Rear || Front == -1)
        {
            return true
        }
        return false
    }

    fun isFull():Boolean
    {
        if (Rear == array.size-1)
        {
            return true
        }
        return false
    }
}