package BFS__Breadth_First_Search

import java.util.*


class BFS_Graph(size:Int) {

    var adj = arrayOfNulls<Adj>(size)

    fun run()
    {
        for (i in 0..adj.size-1)
        {
            adj[i] = Adj()
            adj[i]?.Head = null
        }
    }

    fun add(src:Int ,Des:Int)
    {
        val NewNode = Node(Des, null)

        if (adj[src]?.Head == null)
        {
            adj[src]?.Head = Node(Des,null)
        }

        var last:Node = adj[src]?.Head!!

        while (last.Next != null)
        {
            last = last.Next!!
        }

        last.Next = NewNode

    }
    fun BFS(StartVertex: Int) {

        val visited = arrayOfNulls<Boolean>(adj.size)

        for (i in 0 until adj.size) visited[i] = false

        val Qu:Queue<Int> = LinkedList<Int>()

        Qu.add(StartVertex)

        while (!Qu.isEmpty()) {

            val n = Qu.poll()

            print("$n  ")

            visited[n] = true

            var head: Node? = adj[n]!!.Head

            while (head != null) {

                if (visited[head.Value!!] == false) {

                    Qu.add(head.Value)

                    visited[head.Value!!] = true

                } else {

                    head = head.Next

                }
            }

        }
    }


}