//泛型类型约束 将传入的类型约束为human
class MagicBox4<T : Human> (item: T) {
    var available = false
    private var subject:T = item

    fun fetch():T? {
        //takeIf当表达式返回true时 它会返回接收者对象 如果时false 返回空
        return subject.takeIf { available }
    }

}

open class Human(val age:Int)

class Boy4(val name:String, age:Int):Human(age)

class Man4(val name:String, age:Int):Human(age)



fun main() {
    val magicBox = MagicBox4(Boy4("Jack", 20))
    val man = MagicBox4(Man4("Jack", 20))

    magicBox.available = true
    magicBox.fetch()?.run {
        println("you find $name")
    }
}