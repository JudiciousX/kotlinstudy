//vararg关键字与get函数
//修饰可变参数
class MagicBox5<T : Human> (vararg item: T) {
    var available = false
    //泛型如果是可变参数 在这里一定要写out
    private var subject:Array<out T> = item

    fun fetch(index:Int):T? {
        //takeIf当表达式返回true时 它会返回接收者对象 如果时false 返回空
        return subject[index].takeIf { available }
    }

}

open class Human5(val age:Int)

class Boy5(val name:String, age:Int):Human(age)

fun main() {
    val magicBox = MagicBox5(
        Boy5("Jack", 20),
        Boy5("Jimmy", 20),
        Boy5("Som", 20))

    magicBox.available = true
    //根据索引值拿到一系列中的0号元素 从0开始计数
    magicBox.fetch(0)?.run {
        println("you find $name")
    }
}