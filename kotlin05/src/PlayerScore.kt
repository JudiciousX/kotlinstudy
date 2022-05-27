//解构声明
class PlayerScore (val experience:Int, val level: Int) {
    //使用operator fun component()来标记变量 从1开始计数 使得变量可以支持解构语法
    operator fun component1() = experience
    operator fun component2() = level
}

fun main() {
    //拿到experience 和 level 的值
    val (x,y) = PlayerScore(10, 20)

    println("$x, $y")
}