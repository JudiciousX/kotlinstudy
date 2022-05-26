//主构造函数
class Player3 (
    _name: String,
    //在构造函数中给默认值
    var age: Int = -1,
    var isNormal: Boolean
){
    //将一个属性或者方法private后 后面就不可调用了
    var name = _name

    //初始化块
    init {
        //如果条件没有被满足 就会抛出后面的异常信息
        require(age > 0) {"age must be positive"}
        require(name.isNotBlank()) {"player must have a name."}
    }
}

fun main() {
    //如果要跳过中间的参数 使用具名法
    val p = Player3("Jack", isNormal = false)
    println(p.age)
}