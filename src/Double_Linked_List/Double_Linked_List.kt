package Double_Linked_List

class Double_Linked_List {

    var head:DNode? = null
    var tail:DNode? = null
    constructor(NewNode:DNode?)
    {
        this.head = NewNode
        this.tail = NewNode
    }

    fun add_first(NewNode:DNode?)
    {
        NewNode?.next = head
        head?.prev = NewNode
        head = NewNode
    }
    fun add_last(NewNode:DNode?)
    {
        tail?.next = NewNode
        NewNode?.prev = tail
        tail = NewNode
    }
    fun Display_with_head()
    {
        var cursor:DNode? = head
        while (cursor != null)
        {
            println(cursor.value)
            cursor = cursor.next
        }
    }
    fun Display_with_tail()
    {
        var cursor:DNode? = tail
        while (cursor != null)
        {
            println(cursor.value)
            cursor = cursor.prev
        }
    }
    fun add_with_Index(index:Int,NewNode:DNode?)
    {
        var counter:Int = 0
        var cursor:DNode? = head
        if (index == 0)
        {
            add_first(NewNode)
        }
        while (index-1 != counter)
        {
            counter++
            cursor = cursor?.next
        }
        NewNode?.next = cursor?.next
        cursor?.next= NewNode
        NewNode?.prev = cursor
        NewNode?.next?.prev = NewNode

    }
}