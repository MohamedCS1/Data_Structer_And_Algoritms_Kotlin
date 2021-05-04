package Queue_Double_Linked_List

class DNode<T> {
    var value:T? = null
    var next:DNode<T>? = null
    var prev:DNode<T>? = null
    constructor(value:T?,next:DNode<T>?,prev:DNode<T>?)
    {
        this.value = value
        this.next = next
        this.prev = prev
    }
}