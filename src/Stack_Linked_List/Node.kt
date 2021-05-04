package Stack_Linked_List

class Node<T>{
    var value:T? = null
    var next:Node<T>? = null
    constructor(value:T?,next:Node<T>?)
    {
        this.value = value!!
        this.next = next
    }
}