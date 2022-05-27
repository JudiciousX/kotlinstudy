//嵌套类 相当于内部类
class Player2{

    class Equipment(var name:String ) {
        fun show() = println("equipment:$name")
    }

    fun battle() {

    }
}

fun main() {
    //类名.调用嵌套类 通过外部类.内部类拿出内部类
    Player2.Equipment("sharp knife").show()
}