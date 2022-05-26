//主构造函数
class Player (
    //在类后面的括号内写主构造函数的参数
    //以下划线开头的代表只用一次 临时变量
    _name: String,
    _age: Int,
    _isNormal: Boolean
){
    //将一个属性或者方法private后 后面就不可调用了
    var name = _name
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }
    var age = _age
    var isNormal = _isNormal
}

fun main() {
    val p = Player("Jack", 20, true)
    p.name = "rose"
}