package Stack_Linked_List

fun main() {
    var Stack_Linked_List = Stack_Linked_List<String>(Node("Mohamed",null))
    Stack_Linked_List.Push(Node("Ikram",null))
    Stack_Linked_List.Push(Node("Hnane",null))
    Stack_Linked_List.Push(Node("Yassin",null))

    Stack_Linked_List.Pop()
    Stack_Linked_List.Pop()
    Stack_Linked_List.Pop()
    Stack_Linked_List.Pop()
}