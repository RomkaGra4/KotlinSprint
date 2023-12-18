package lesson_20

fun main() {
    val phrases = RobotSay(
        mutableListOf(
            "Первая фраза робота",
            "Вторая фраза робота",
            "Третья фраза робота",
            "Четвертая фраза робота",
            "Пятая фраза робота"
        )
    )

    phrases.say()
    phrases.setModifier {
        it.reversed()
    }
    phrases.say()

}

class RobotSay(phrase: MutableList<String>) {


    private val randomString = phrase.random()
    private var modifier: (String) -> String = { it }

    fun say() {
        println(modifier(randomString))
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

}


