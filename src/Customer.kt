class Customer(val id:Int,val name:String,var cash:Float ){
    var items:ArrayList<Snack> = ArrayList(1)
    fun purchase( item:Snack,quantity:Int,fromwhere:VendingMachine){

        for(i in 1..quantity){
            fromwhere

            items.add(item)
            cash=cash-item.cost
            if(cash<0){
                isBroke=true
                cash+=cash+item.cost
                items.removeAt(i-1)
                println(name+"is broke"+item.name+"can not be purchased")
                return
            };


        }
        println(name+"has $"+cash+" on hand and "+quantity+" of "+item.name)

    }
    fun obtaincash(newcash:Float){
        cash+=newcash
        println(name+" has $"+cash+" on hand")
    }
    var isBroke:Boolean =false




}