package Stack_Array

import javax.lang.model.element.Element

class Stack_Array(size:Int) {
    var Top:Int = -1
    var array = arrayOfNulls<String>(size)

    fun Push(element:String)
    {
        if (isFull())
        {
            return println("The Stack is Full")
        }
        Top++
        array[Top] = element
    }

    fun Pop():String
    {
        if (isEmptu())
        {
            return println("The Stack is Empty").toString()
        }
        return println(array[Top--]).toString()
    }

    fun isFull():Boolean
    {
        if (Top == array.size-1)
        {
            return true
        }
        return false
    }

    fun isEmptu():Boolean
    {
        if (Top == -1)
        {
            return true
        }
        return false
    }
    fun Display()
    {
        for (i in 0..array.size-1)
        {
            println(array[Top--])
        }
    }

}