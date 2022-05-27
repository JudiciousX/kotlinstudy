//匿名内部类
open class Player {
    open fun load() = "loading nothing.."
}

fun main() {
    //这里的p是变量名 接收一个匿名对象 而不是匿名内部类的名字
    val p = object : Player() {
        override fun load() = "anonymous nothing..."
    }

    println(p.load())       //anonymous nothing...
}