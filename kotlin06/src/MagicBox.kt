//定义泛型类
class MagicBox<T> (item: T) {
    private var subject:T = item

}

class Boy(val name:String, val age:Int)

class Dog(val weight:Int)

fun main() {
    val magicBox = MagicBox(Boy("Jack", 20))
    val dog = MagicBox(Dog(10))
}