package Linked_List

class Linked_List<T> {

    var head:Node<T>? =null
    constructor(NewNode:Node<T>)
    {
        NewNode.next = head
        head = NewNode
    }

    fun add_first(NewNode: Node<T>)
    {
        NewNode.next = head
        head = NewNode
    }

    fun add_last(NewNode: Node<T>) {
        var cursor: Node<T>? = head
        while (cursor?.next != null)
        {
            cursor = cursor.next

        }
        cursor?.next = NewNode
    }

    fun Display()
    {
        var cursor:Node<T>? = head
        while (cursor != null)
        {
            println(cursor.value)
            cursor = cursor.next
        }
    }

    fun add_with_index(index:Int,NewNode:Node<T>)
    {
        var conter:Int=0
        var cursor:Node<T>? = head
        if (index == 0)
        {
            add_first(NewNode)
        }
        else
        {
            while (conter != index-1)
            {

                cursor = cursor?.next

                if (cursor == null)
                {
                    return println("index ${index} Outside Linked_List")
                }
                conter++

            }
            NewNode.next = cursor?.next
            cursor?.next = NewNode
        }
    }
    fun Delete()
    {
        head = head?.next
    }


}