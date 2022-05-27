//运算符重载
data class Coordinate2(var x:Int, var y:Int) {
    var isInBounds = x > 0 && y > 0

    //把一个对象添加到另一个对象里
    operator fun plus(other: Coordinate2) = Coordinate2(x + other.x, y + other.y)
}

fun main() {

    val c1 = Coordinate2(10,20)
    val c2 = Coordinate2(10,20)

    println(c1 + c2)
    //Coordinate2(x=20, y=40)

}