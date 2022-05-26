class Student (
    _name: String,
    val age: Int
) {
    var name = _name

    val subject:String

    init {
        println("init")
        subject = "mat"
    }
    var score = 10
    private val hobby = "music"

    constructor(_name: String):this(_name, 10) {
        score = 20;
    }
}

fun main() {
    Student("Jack")
}