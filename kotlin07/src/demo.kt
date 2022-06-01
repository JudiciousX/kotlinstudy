//原汁原味的函数
fun add_1(x:Int, y:Int):Int {
    return x+y;
}

//表达式函数
fun add_2(x:Int, y:Int) = x+y

//fun的lambda表达式
fun add_3() = { a:Int, b:Int ->
    a+b
}

val add_4 = {a:Int, b:Int ->
    a+b
}
fun main() {
    println(add_3().invoke(1,2))
    println(add_4.invoke(1,3))
    println(add_4(1,5))
}