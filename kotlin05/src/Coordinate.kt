//数据类
data class Coordinate(var x:Int, var y:Int) {
    var isInBounds = x > 0 && y > 0
}

fun main() {
    //数据类自己生成了toString 等方法
    println(Coordinate(10,10))
    // == 比较的是内容 equals 一般的比较默认都是使用Any的equals-> 默认实现=== Any的默认实现就是使用的比较引用
    // === 比较的是引用
    println(Coordinate(10, 20) == Coordinate(10, 20))
    //数据类中重写了equals方法 所以这里 == 使用的是数据类中的equals方法

    //而数据类不用声明就支持解构语法 因为内部已经帮我们声明了
    val(x, y) = Coordinate(10,20)
    println("$x, $y")
}