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


}
