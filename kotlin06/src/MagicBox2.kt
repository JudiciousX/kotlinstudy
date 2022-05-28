//泛型函数
class MagicBox2<T> (item: T) {
    var available = false
    private var subject:T = item

    fun fetch():T? {
        //takeIf当表达式返回true时 它会返回接收者对象 如果时false 返回空
        return subject.takeIf { available }
    }
}

class Boy2(val name:String, val age:Int)


fun main() {
    val magicBox = MagicBox2(Boy2("Jack", 20))

    magicBox.available = true
    magicBox.fetch()?.run {
        println("you find $name")
    }
}