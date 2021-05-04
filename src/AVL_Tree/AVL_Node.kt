package AVL_Tree

class AVL_Node {
    var Value:Int? = null
    var Height:Int? = null
    var Left:AVL_Node? = null
    var Right:AVL_Node? = null
    constructor(d:Int)
    {
        this.Value = d
        this.Height = 1
    }
}