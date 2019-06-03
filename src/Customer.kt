class Customer(val id:Int,val name:String,var cash:Float ){
    var items:ArrayList<Snack> = ArrayList(1)
    fun purchase( item:Snack,quantity:Int):Float{

        for(i in 1..quantity){

            items.add(item)
            cash=cash-item.cost
            println(items[i-1].name+cash)
        }
        println(name+"has $"+cash+" on hand and "+quantity+" of "+item.name)

        return cash
    }

}