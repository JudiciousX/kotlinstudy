//主构造函数
class Player2 (
    //在类后面的括号内写主构造函数的参数
    //以下划线开头的代表只用一次 临时变量
    _name: String,
    //在主构造函数里定义属性 直接用一个定义同时指定参数和类属性
    var age: Int,
    var isNormal: Boolean
){
    //将一个属性或者方法private后 后面就不可调用了
    var name = _name
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }

    //次构造函数 内部会调用主构造函数
    constructor(name: String) : this(name, age = 10, isNormal = false)

    //在次构造函数内定义初始化代码逻辑
    constructor(name: String, age: Int) : this(name, age, isNormal = false) {
        this.name = name.toUpperCase()
    }
}

fun main() {
    val p = Player2("Jack", 20, true)
    p.name = "rose"
    var p2 = Player2("Jack")
    var p3 = Player2("Capper", 20)
    println(p3.name)
}