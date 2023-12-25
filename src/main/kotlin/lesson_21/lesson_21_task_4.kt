package lesson_21

import java.io.File

fun main() {

    val file = File("words.txt")

    file.writeTextAndSave()
    println(file.readLines())

}

fun File.writeTextAndSave() {

    val text = readln().lowercase()
    createNewFile()
    writeText(text + this.readText())

    println("Добавлено слово: $text в файл $name")

}