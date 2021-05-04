package Hash_Table

class Hash_Table(size:Int) {

    var array = arrayOfNulls<Node>(size)

    fun run()
    {
        for (i in 0..array.size-1)
        {
           array[i] = Node(null,null)
        }
    }

    fun Get_hash(Key:Int): Int {
        return Key%array.size
    }
    fun Put(Key: Int,value:String)
    {
        val index:Int = Get_hash(Key)
        var cursor: Node? = array[index]
        var NewNode = Node(Key,value)
        NewNode.next = cursor?.next
        cursor?.next = NewNode
    }

    fun Get(Key: Int)
    {
        var index:Int = Get_hash(Key)
        var cursor:Node? = array[index]
        cursor = cursor?.next
        if (cursor == null)
        {
            return println("The Key is Invalid")
        }
        println(cursor.value)
    }

    fun Get_Whit_Rank(Key: Int,Rank:Int)
    {
        var counter:Int = 0
        var index =Get_hash(Key)
        var cursor:Node? = array[index]
        cursor = cursor?.next
        while (counter != Rank-1)
        {
            cursor = cursor?.next
            if (cursor == null)
            {
                return println("The Key or Rank is Invalid")
            }
            counter++
        }
        return println(cursor?.value)
    }


}