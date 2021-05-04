package BFS__Breadth_First_Search

fun main() {
    val g = BFS_Graph(6)

    g.run()

    g.add(0 ,2)
    g.add(0 ,1)
    g.add(2 ,4)
    g.add(2 ,3)
    g.add(1 ,5)


    println("Breadth First Search Algorithm")

    g.BFS(0)
}