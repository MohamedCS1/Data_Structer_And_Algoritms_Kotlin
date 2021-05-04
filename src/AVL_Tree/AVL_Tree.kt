package AVL_Tree

class AVL_Tree (){

    var Root:AVL_Node? = null

    fun Height(N:AVL_Node?):Int
    {
        if (N == null)
        {
            return 0
        }
        return N.Height!!
    }

    fun RightRotation(y:AVL_Node):AVL_Node
    {
        val x:AVL_Node? = y.Left
        val T2:AVL_Node? = x!!.Right

        x.Right = y
        y.Left = T2

        y.Height = maxOf(Height(y.Left) ,Height(y.Right)) + 1
        x.Height = maxOf(Height(x.Left) ,Height(x.Right)) + 1

        return x

    }

    fun LeftRotation(x:AVL_Node):AVL_Node
    {
        val y:AVL_Node? = x.Right
        val T2:AVL_Node? = y!!.Left

        y.Left = x
        x.Right = T2

        x.Height = maxOf(Height(x.Left) ,Height(x.Right)) + 1
        y.Height = maxOf(Height(y.Left) ,Height(y.Right)) + 1

        return y
    }

    fun GetBalance(N:AVL_Node?):Int
    {
        if(N == null)
        {
            return  0
        }

        return Height(N.Left) - Height(N.Right)
    }

    fun Insert(RootExplore:AVL_Node?, Value:Int):AVL_Node
    {
        if (RootExplore == null)
        {
            return AVL_Node(Value)
        }

        if (Value < RootExplore.Value!!)
        {
            RootExplore.Left = Insert(RootExplore.Left ,Value)
        }
        else if (Value > RootExplore.Value!!)
        {
            RootExplore.Right = Insert(RootExplore.Right ,Value)
        }
        else
        {
            return RootExplore
        }

        RootExplore.Height = 1 + maxOf(Height(RootExplore.Left) ,Height(RootExplore.Right))

        val Balance = GetBalance(RootExplore)

        if (Balance > 1 && Value < RootExplore.Left!!.Value!!)
        {
            return RightRotation(RootExplore)
        }

        if (Balance < -1 && Value > RootExplore.Right!!.Value!!)
        {
            return LeftRotation(RootExplore)
        }

        if (Balance > 1 && Value > RootExplore.Left!!.Value!!)
        {
            RootExplore.Left = LeftRotation(RootExplore.Left!!)
            return RightRotation(RootExplore)
        }

        if (Balance < -1 && Value < RootExplore.Right!!.Value!!)
        {
            RootExplore.Right = RightRotation(RootExplore.Right!!)
            return LeftRotation(RootExplore)
        }

        return RootExplore
    }

    fun Display_Tree(RootExplore:AVL_Node?)
    {
        if (RootExplore == null)
        {
            return
        }
        print("${RootExplore.Value}    ")
        Display_Tree(RootExplore.Left)
        Display_Tree(RootExplore.Right)
    }
}