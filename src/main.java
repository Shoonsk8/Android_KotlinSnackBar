import kotlin.random.Random

fun main(args: Array<String>) {
        val player = PlayerCharacter("Desmond")
        val monster = Monster("Wolf", 5, 3, 2, 2)
        gameLoop(player, Array(4){Monster("Wolf $it", it + 1, Random.nextInt(5), 2, Random.nextInt(2))})
        }