package Queue_Double_Linked_List

fun main() {
    val QDLinked_List = Queue_Double_Linked_List<String>(DNode("Mohamed",null,null))
    QDLinked_List.Queue(DNode("Yassin",null,null))
    QDLinked_List.Queue(DNode("Aniss",null,null))
    println("----Display----")
    QDLinked_List.Display()
    println("----DeQueue----")
    QDLinked_List.DeQueue()
    QDLinked_List.DeQueue()
    QDLinked_List.DeQueue()
    QDLinked_List.DeQueue()
}