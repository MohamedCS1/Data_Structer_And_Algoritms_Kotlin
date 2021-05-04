package DFS___Depth_First_Search

import java.util.*


class DFS_Graph(size:Int) {

    var adj = arrayOfNulls<LinkedList<Int>>(size)

    fun run()
    {
        for (i in adj.indices)
        {
            adj[i] = LinkedList<Int>()
        }

    }

    fun add(Src:Int ,Des:Int)
    {
         adj[Src]?.add(Des)
    }

    fun DFS(StartVertex: Int) {

        val visited = arrayOfNulls<Boolean>(adj.size)
        for (i in 0 until adj.size)
        {
            visited[i] = false
        }

        val stack = Stack<Int>()

        stack.push(StartVertex)

        while (stack.isNotEmpty()) {

            val n = stack.pop()

            if (visited[n] == false) {
                print("$n ")
                visited[n] = true
            }

            val itr: Iterator<Int>? = adj[n]?.iterator()!!
            while (itr!!.hasNext()) {
                val v = itr.next()
                if (visited[v] == false) stack.push(v)
            }
        }
    }

}