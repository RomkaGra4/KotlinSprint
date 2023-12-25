package lesson_21

fun main() {

    val player = Player(60, 100).isHealthy()
    println(player)

}

class Player(var currentHealth: Int, val maxHealth: Int)

fun Player.isHealthy(): Boolean = this.currentHealth == this.maxHealth