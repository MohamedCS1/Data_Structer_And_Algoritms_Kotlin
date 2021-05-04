package Stack_Linked_List

class Stack_Linked_List<T> {
    var head:Node<T>? = null
    constructor(head:Node<T>)
    {
        this.head = head
    }

    fun Push(NewNode: Node<T>)
    {
        NewNode.next = head
        head = NewNode
    }

    fun Pop()
    {
        if (head == null)
        {
            return println("The Stack is Empty")
        }
        println(head?.value)
        head = head?.next
    }
}