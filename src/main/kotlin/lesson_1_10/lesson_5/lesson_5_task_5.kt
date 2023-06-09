package lesson_1_10.lesson_5

import kotlin.random.Random

fun main() {

    println("Введите два числа (от 1 до 100):")
    val firstUserNumber = readln().toInt()
    val secondUserNumber = readln().toInt()

    val firstNumber = (1..100).random()
    val secondNumber = (1..100).random()

    val result =
        if (firstUserNumber == firstNumber && secondUserNumber == secondNumber) "Поздравляем! Вы выиграли главный приз!"
        else if (firstUserNumber == firstNumber || secondUserNumber == secondNumber) "Вы выиграли утешительный приз!"
        else "Неудача! Крутите барабан!"

    println(result)
    println("Числа, необходимые для победы: $firstNumber и $secondNumber")
}