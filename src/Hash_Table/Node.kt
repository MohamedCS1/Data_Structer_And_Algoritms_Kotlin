package Hash_Table

class Node {
    var Key:Int? = null
    var value:String? = null
    var next:Node? = null
    constructor(Key:Int?,value:String?)
    {
        this.Key = Key
        this.value = value
        this.next = null
    }

    fun GetKey(): Int? {
        return Key
    }

    fun GetValue(): String? {
        return value
    }
}