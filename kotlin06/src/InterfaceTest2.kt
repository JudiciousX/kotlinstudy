//接口中的默认实现
interface Movable2{

    //只提供get的时候就定义为val
    //接口中定义为val 实现的时候可以改为var(需要提供get set方法)
    //接口中定义为var 实现的时候只能是var 当然提供默认实现的代码 也可以不重写属性
    val maxSpeed:Int
        get() = (1..100).shuffled().last()

    var wheels:Int

    fun move(movable: Movable2): String
}

class Car2(_name:String, override var wheels: Int = 4):Movable2 {

    //需要重写方法以及属性的get set方法
    override val maxSpeed: Int
        get() = super.maxSpeed
    //调用父类的方法

    override fun move(movable: Movable2): String {
        TODO("Not yet implemented")
    }

}
