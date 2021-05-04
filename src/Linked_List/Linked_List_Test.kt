package Linked_List

fun main() {
    val Linked_list = Linked_List<String>(Node("Mohamed",null))
    Linked_list.add_first(Node("Yassin",null))
    Linked_list.add_first(Node("Abdo",null))
    Linked_list.add_first(Node("Samir",null))
    Linked_list.add_last(Node("ikram",null))
    Linked_list.add_with_index(3,Node("hamada",null))
    Linked_list.Display()
}