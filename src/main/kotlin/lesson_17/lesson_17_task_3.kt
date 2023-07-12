package lesson_17

fun main() {
    val folder1 = Folder("Music", 224, true)
    println(folder1.name)
    println(folder1.files)
    folder1.isSecret = false
    println(folder1.name)
    println(folder1.files)

}

class Folder (_name: String, _files: Int, _isSecret: Boolean){
    val name: String = _name
        get() = if (isSecret) "Скрытая папка" else field
    val files: Int = _files
        get() = if (isSecret) 0 else field
    var isSecret: Boolean = _isSecret

}
