package lesson_17

fun main() {

    val package1 = Package(1, "Волгоград")
    package1.location = "Воронеж"
    package1.location = "Москва"
    package1.location = "Тверь"
    println(package1.locationCounter)

}

class Package(_number: Int, _location: String){

    val number: Int = _number
    var location: String = _location
        set(value) {
            field = value
            locationCounter++
        }
    var locationCounter: Int = 0

}