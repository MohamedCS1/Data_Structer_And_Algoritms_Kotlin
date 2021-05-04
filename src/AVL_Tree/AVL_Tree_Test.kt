package AVL_Tree

fun main() {

    val avltree = AVL_Tree()
    avltree.Root = avltree.Insert(avltree.Root, 30);
    avltree.Root = avltree.Insert(avltree.Root, 10);
    avltree.Root = avltree.Insert(avltree.Root, 20);
    avltree.Root = avltree.Insert(avltree.Root, 40);
    avltree.Root = avltree.Insert(avltree.Root, 50);

    avltree.Display_Tree(avltree.Root!!)


}




