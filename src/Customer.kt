class Customer(val id:Int,val name:String,var cash:Float ){
    var items:ArrayList<Snack> = ArrayList(1)
    fun purchase( item:Snack,quantity:Int,fromwhere:VendingMachine){

        for(i in 1..quantity){
            fromwhere

            items.add(item)
            cash=cash-item.cost

        }
        println(name+"has $"+cash+" on hand and "+quantity+" of "+item.name)

    }
    fun obtaincash(newcash:Float){
        cash+=newcash
        println(name+" has $"+cash+" on hand")
    }
}