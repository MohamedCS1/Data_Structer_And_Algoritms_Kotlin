package Binary_Tree

fun main() {
    val binarytree = Binary_Tree(Node(50,null,null))

    binarytree.Add(Node(60,null,null),binarytree.Root)

    binarytree.Add(Node(20,null,null),binarytree.Root)

    binarytree.Add(Node(24,null,null),binarytree.Root)

    binarytree.Add(Node(13,null,null),binarytree.Root)

    binarytree.Add(Node(23,null,null),binarytree.Root)

    binarytree.Add(Node(10,null,null),binarytree.Root)

    binarytree.Add(Node(15,null,null),binarytree.Root)

    binarytree.Add(Node(60,null,null),binarytree.Root)

    binarytree.Add(Node(55,null,null),binarytree.Root)

    binarytree.Add(Node(65,null,null),binarytree.Root)

    binarytree.Add(Node(56,null,null),binarytree.Root)

    // binarytree.successorPredecessor(50,binarytree.Root)

   // println("The successor is -----> ${binarytree.Successor} and Predecessor is -----> ${binarytree.Predecessor}")

   // binarytree.Delete(50,binarytree.Root)

    binarytree.Display_Tree_Pre_Order(binarytree.Root)

    print("\n")

    binarytree.Display_Tree_In_Order(binarytree.Root)

    print("\n")

    binarytree.Display_Tree_Post_Order(binarytree.Root)

    print("\n")

    binarytree.Display_Tree_Level_Order(binarytree.Root)

    binarytree.get_Max(binarytree.Root)

    binarytree.get_Min(binarytree.Root)

    binarytree.Check_Balanced(binarytree.Root)


}