/*//[]操作符取值
class MagicBox6<T : Human6> (vararg item: T) {
    var available = false
    //泛型如果是可变参数 在这里一定要写out
    private var subject:Array<out T> = item

    fun fetch(index:Int):T? {
        //takeIf当表达式返回true时 它会返回接收者对象 如果时false 返回空
        return subject[index].takeIf { available }
    }

    //函数名get表示重载[]
    operator fun get(index: Int): T? = subject[index]?.takeIf { available }

}

open class Human6(val age:Int)

class Boy6(val name:String, age:Int):Human6(age)

fun main() {
    val magicBox = MagicBox6(
        Boy6("Jack", 20),
        Boy6("Jimmy", 20),
        Boy6("Som", 20))

    magicBox.available = true
    //根据索引值拿到一系列中的0号元素 从0开始计数
    magicBox.fetch(0)?.run {
        println("you find $name")
    }

    val boy6 = magicBox[1]
}*/
