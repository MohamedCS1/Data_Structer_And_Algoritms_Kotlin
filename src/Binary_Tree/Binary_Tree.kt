package Binary_Tree

import java.util.*
import kotlin.system.exitProcess

class Binary_Tree {

    var Root:Node
    constructor(Root:Node)
    {
        this.Root = Root
    }


    fun Add(NewNode: Node,RootExplore:Node)
    {
        if (NewNode.Value!! > RootExplore.Value!!)
        {
           if (RootExplore.Right == null)
           {
               RootExplore.Right = NewNode
           }
           else
           {
               Add(NewNode,RootExplore.Right!!)
           }
        }
        if (NewNode.Value!! <= RootExplore.Value!!)
        {
            if (RootExplore.Left == null)
            {
                RootExplore.Left = NewNode
            }
            else
            {
                Add(NewNode,RootExplore.Left!!)
            }
        }

    }

    fun Search(Value : Int , RootExplore:Node?)
    {
        Display_Tree_Level_Order(RootExplore)
        if (RootExplore == null )
        {
            println("The Element $Value not found")
            return
        }
        if (Value == RootExplore.Value)
        {
            println("The Element $Value found")
            return
        }
        if (Value > RootExplore.Value!!)
        {
            Search(Value , RootExplore.Right)
        }
        if (Value < RootExplore.Value!!)
        {
            Search(Value , RootExplore.Left)
        }

    }

    fun Display_Tree_Pre_Order(RootExplore: Node?)
    {
        if(RootExplore == null)
        {
            return
        }
        print("${RootExplore.Value}    ")

        Display_Tree_Pre_Order(RootExplore.Left)
        Display_Tree_Pre_Order(RootExplore.Right)
    }

    fun Display_Tree_In_Order(RootExplore: Node?)
    {
        if(RootExplore == null)
        {
            return
        }
        Display_Tree_In_Order(RootExplore.Left)
        print("${RootExplore.Value}    ")
        Display_Tree_In_Order(RootExplore.Right)
    }

    fun Display_Tree_Post_Order(RootExplore: Node?)
    {
        if(RootExplore == null)
        {
            return
        }
        Display_Tree_Post_Order(RootExplore.Left)
        Display_Tree_Post_Order(RootExplore.Right)
        print("${RootExplore.Value}    ")
    }

    fun Display_Tree_Level_Order(RootExplore: Node?)
    {
        if(RootExplore == null)
        {
            return
        }
        val Queue:Queue<Node> = LinkedList<Node>()

        Queue.add(RootExplore)

        while (Queue.isNotEmpty())
        {
            val cursor:Node = Queue.poll()
            print("${cursor.Value}    ")
            if (cursor.Left != null)
            {
                Queue.add(cursor.Left!!)
            }
            if (cursor.Right != null)
            {
                Queue.add(cursor.Right!!)
            }
            Queue.remove(cursor)
        }

    }
    var isBalance:Boolean ?= null
    fun Hight(RootExplore: Node?){
        if (RootExplore == null)
        {
            return
        }
        var cursor_Left:Node = RootExplore
        var cursor_Right:Node = RootExplore
        var counter_Left:Int = 0
        var counter_Right:Int = 0
        while (cursor_Left.Left != null)
        {
            cursor_Left = cursor_Left.Left!!
            counter_Left++
        }
        while (cursor_Right.Right != null)
        {
            cursor_Right = cursor_Right.Right!!
            counter_Right++
        }

        if ((counter_Left - counter_Right) < -1  || (counter_Left - counter_Right) > 1)
        {
            isBalance = false
            return
        }
        Hight(RootExplore.Left)
        Hight(RootExplore.Right)

    }

    fun Check_Balanced(RootExplore: Node)
    {
        kotlin.run {
            Hight(RootExplore)
        }

        if (isBalance == false)
        {
            println("The Tree is Not Balanced")
        }
        else
        {
            println("The Tree is Balanced")
        }
    }

    fun get_Max(RootExplore: Node?)
    {
        var cursor:Node = RootExplore!!
        while (cursor.Right != null)
        {
           cursor = cursor.Right!!
        }
         println("\n")
         println("The Man is ${cursor.Value}")
    }

    fun get_Min(RootExplore: Node?)
    {
        var cursor:Node = RootExplore!!
        while (cursor.Left != null)
        {
            cursor = cursor.Left!!
        }
        println("\n")
        println("The Min is ${cursor.Value}")
    }

    var Predecessor:Int? = null
    var Successor:Int? = null
    fun successorPredecessor(Element: Int ,RootExplore: Node)
    {

        if (RootExplore.Value == Element)
        {

            if (RootExplore.Right != null)
            {
                var pointer:Node = RootExplore.Right!!
                while (pointer.Left != null)
                {
                    pointer = pointer.Left!!
                }
                Successor = pointer.Value
            }
            if (RootExplore.Left != null)
            {
                var pointer:Node = RootExplore.Left!!
                while (pointer.Right != null)
                {
                   pointer = pointer.Right!!
                }
                Predecessor = pointer.Value
            }
        }
        else if (RootExplore.Value!! < Element)
        {
            Predecessor = RootExplore.Value
            successorPredecessor(Element ,RootExplore.Right!!)
        }
        else if (RootExplore.Value!! > Element)
        {
            Successor = RootExplore.Value
            successorPredecessor(Element ,RootExplore.Left!!)
        }


    }

    fun Delete(Element: Int, RootExplore: Node)
    {
        var cursor:Node = RootExplore
        var Parent:Node? = null

        while (cursor.Value != Element)
        {
            try {
                Parent = cursor
                if (Element > cursor.Value!!)
                {
                    cursor = cursor.Right!!
                }
                else
                {
                    cursor = cursor.Left!!
                }
            }catch (Ex:Exception)
            {
                println("Element $Element Not found")
                return
            }

        }

        if (cursor.Left == null && cursor.Right == null)
        {
            if (cursor != RootExplore)
            {
                if (Parent!!.Left == cursor)
                {
                    Parent.Left = null
                }
                else
                {
                     Parent.Right = null
                }
            }


        }
        else if (cursor.Left != null && cursor.Right == null || cursor.Right != null && cursor.Left == null)
        {
           var child:Node? = null

            if (cursor.Left == null)
            {
                child = cursor.Right
                Parent!!.Right = child
            }
            else
            {
                child = cursor.Left
                Parent!!.Left = child
            }
        }
        else
        {
            successorPredecessor(Element,RootExplore)

            cursor.Value = Successor

            Delete(Element , RootExplore)

        }


    }

}