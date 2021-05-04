package Double_Linked_List

fun main() {
    val DLinked_List = Double_Linked_List(DNode("Mohamed",null,null))
    DLinked_List.add_first(DNode("Djmal",null,null))
    DLinked_List.add_first(DNode("Yassin",null,null))
    DLinked_List.add_last(DNode("abdo",null,null))
    DLinked_List.add_last(DNode("hanane",null,null))
    DLinked_List.add_with_Index(2,DNode("Aniss",null,null))
    DLinked_List.Display_with_head()
    println("----Start With Tail----")
    DLinked_List.Display_with_tail()
}