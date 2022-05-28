//抽象类
abstract class Gun(val range: Int) {
    abstract fun pullTrigger(): String

    //也可以包含不抽象的方法
    fun ok():String {
        return "xxx"
    }
}

class AK47(val price:Int): Gun(range = 10) {

    //重写抽象方法
    override fun pullTrigger(): String {
        TODO("Not yet implemented")
    }

}
