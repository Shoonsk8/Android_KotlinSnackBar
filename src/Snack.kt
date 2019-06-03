class Snack(val id:Int, val name:String, var quantity:Int, var cost:Float, var vendingmachineid:Int){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Snack

        if (id != other.id) return false
        if (name != other.name) return false
        if (quantity != other.quantity) return false
        if (cost != other.cost) return false
        if (vendingmachineid != other.vendingmachineid) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        result = 31 * result + quantity
        result = 31 * result + cost.hashCode()
        result = 31 * result + vendingmachineid
        return result
    }
}