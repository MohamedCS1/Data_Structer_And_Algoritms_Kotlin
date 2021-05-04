package Queue_Double_Linked_List

class Queue_Double_Linked_List<T> {

    var Rear:DNode<T>? = null
    var Front:DNode<T>? = null
    constructor(NewNode:DNode<T>)
    {
        this.Rear = NewNode
        this.Front = NewNode
    }

    fun Queue(NewNode: DNode<T>)
    {
        Rear?.next = NewNode
        NewNode.prev = Rear
        Rear = NewNode

    }

    fun DeQueue()
    {
        if (Front == null)
        {
            return println("The Queue is Empty")
        }
        println(Front?.value)
        Front = Front?.next
        Front?.prev = null
    }

    fun Display()
    {
        var cursor:DNode<T>? = Front
        while (cursor != null)
        {
            println(cursor.value)
            cursor = cursor.next
        }
    }
}