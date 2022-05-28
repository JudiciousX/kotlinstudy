//接口
interface Movable{
    //接口中的属性只能是抽象的,不允许初始化值,接口中不会保存属性值,实现接口时,必须重写属性
    var maxSpeed:Int
    var wheels:Int

    fun move(movable: Movable): String
}

class Car(_name:String, override var wheels: Int = 4):Movable {

    //需要重写方法以及属性的get set方法
    override var maxSpeed: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun move(movable: Movable): String {
        TODO("Not yet implemented")
    }

}
fun main() {

}