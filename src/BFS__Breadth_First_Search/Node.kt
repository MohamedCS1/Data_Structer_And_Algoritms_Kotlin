package BFS__Breadth_First_Search

class Node {

    var Value:Int? = null
    var Next:Node? = null

    constructor(Value: Int?, Next: Node?)
    {
        this.Value = Value
        this.Next = Next
    }
}