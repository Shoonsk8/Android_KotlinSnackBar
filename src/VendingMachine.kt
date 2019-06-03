class VendingMachine(val  id :Int, val name:String){
    var cash:Float = 0.0f
    var items: ArrayList<Snack> = ArrayList(1)
    fun add(item:Snack, quantity:Int){
        for(i in 1..quantity){
            quantity
            items.add(item)
        }
        println(name+" stocked " +quantity + " of "+item.name)

    }
    fun dispense(item: Snack,quantity: Int){

        for(i in 1..quantity){
            for (index in 0..items.size-1){
                if(items[index].name==item.name){
                    items.removeAt(index)
                    cash+=item.cost
                    println(item.name+"has been dispensed. Cash $"+cash )
                    break;

                };
            }


        }

    }
}