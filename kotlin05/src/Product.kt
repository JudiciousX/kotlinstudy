import java.io.File

//类的继承
open class Product (val name:String) {
    fun description() = "Product: $name"

    //如果需要重写方法 也需要使用open修饰要重写的方法
    open fun load() = "Nothing..."
}

class LuxuryProduct : Product("Lucury") {
    //重写方法前需要添加override关键字
    override fun load() = "LuxuryProduct loading..."

    fun special() = "LuxuryProduct special function"
}

fun main() {
    //类似于java中多态
    val p:Product = LuxuryProduct()

    println(p.load())

    println(p is Product)
    println(p is LuxuryProduct)
    println(p is File)

    //向下转型 使用as操作符
//    if (p is LuxuryProduct) {
//        println((p as LuxuryProduct).special())
//    }

    //转型转一次后 p就指向这个转化后的对象了
    println((p as LuxuryProduct).special())

    p.special()

    println(p is Any)
}