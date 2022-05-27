//copy
data class Student(var name:String, val age:Int) {
    private val hobby = "music"
    val subject:String
    var score = 0

    init {
        println("initializing student")
        subject = "math"
    }

    //坑 在次构造函数中的代码在copy中不会执行
    constructor(_name:String):this(_name, 10){
        println("xxx")
        score = 10
    }

    override fun toString(): String {
        return "Student(name='$name', age=$age, hobby='$hobby', subject='$subject', score=$score)"
    }


}

fun main() {
    //copy的是结构 而不是内容
    val s = Student("Jack")
    val copy = s.copy("Rose")

    println(s)
    println(copy)
    //Student(name='Jack', age=10, hobby='music', subject='math', score=10)
    //Student(name='Rose', age=10, hobby='music', subject='math', score=0)
}