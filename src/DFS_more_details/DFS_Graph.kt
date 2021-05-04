package DFS_more_details

import java.util.*


class DFS_Graph(size:Int) {

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
    fun DFS(StartVertex: Int) {

        val visited = arrayOfNulls<Boolean>(adj.size)

        for (i in 0 until adj.size) visited[i] = false

        val st = Stack<Int>()

        st.push(StartVertex)

        while (!st.isEmpty()) {

            val n = st.pop()

            st.push(n)

            visited[n] = true

            var head: Node? = adj[n]!!.Head

            var isFinish = true

            while (head != null) {

                if (visited[head.Value!!] == false) {

                    st.push(head.Value)

                    visited[head.Value!!] = true

                    isFinish = false

                    break

                } else {

                    head = head.Next

                }
            }
            if (isFinish) {
                val out = st.pop()
                print(" $out")
            }
        }
    }


}