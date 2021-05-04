package DFS_more_details

fun main() {

    val g = DFS_Graph(6)

    g.run()

    g.add(0 ,2)
    g.add(0 ,1)
    g.add(2 ,4)
    g.add(2 ,3)
    g.add(1 ,5)


    println("Depth First Search")

    g.DFS(0)
}