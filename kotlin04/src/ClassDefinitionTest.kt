//定义类
class Player0 {

    //自动生成get和set方法 如果是非可空类型 NotNull 如果是可空类型 Nullable
    //如果有多个属性 使用field就在属性后添加即可
    var name:String = "Jack"
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }

    var name2 = "Capper"
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }

    //计算属性 不需要取出属性的值
    var age = 12
        get() = (1..6).shuffled().first()

    fun saySomething() {
        name?.also {
            println("Hello ${it.toUpperCase()}")
        }
    }
}

fun main() {
    var p = Player0()
    p.saySomething()
}