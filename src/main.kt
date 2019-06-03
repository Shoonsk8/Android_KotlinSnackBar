import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

fun main(args: Array<String>) {
    val jane=Customer(1,"Jane",45.25F)
    val bob=Customer(2,"Bob",33.14F)

    val food=VendingMachine(1,"Food")
    val drink=VendingMachine(2,"Drink")
    val office=VendingMachine(3,"Office")

    val chips = Snack(1,"Chips",36, 1.75F,1)
    val chocolateBar = Snack(2,"Chocolate Bar",36, 1.00F,1)
    val pretzel = Snack(3,"Pretzel",30, 2F,1)
    val soda = Snack(4,"Soda",24, 2.5F,2)
    val water = Snack(5,"water",20, 2.75F,2)
    jane.purchase(soda,3,drink)
    jane.purchase(pretzel,1,food)
    bob.purchase(soda,2,drink)
    jane.obtaincash(10F)
    jane.purchase(chocolateBar,1,food)
    food.add(pretzel,30)
    food.add(pretzel,12)
    for(i in 1..10){
        bob.purchase(pretzel,3,food)
        1

    }

    var snacks:ArrayList<Snack> = ArrayList(1)
    var jihan:ArrayList<VendingMachine> =ArrayList(1)

    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()
    jane.purchase(soda,a,drink)
}
