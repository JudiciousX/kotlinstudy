//延迟初始化
class Player4 {
    //延迟初始化
    lateinit var equipment: String

    fun ready() {
        equipment = "share knife"
    }

    fun battle() {
        //进行判断 如果没有被初始化就不执行后面的
        if(::equipment.isInitialized) println(equipment)

    }
}

fun main() {
    var p = Player4()
    p.ready()
    p.battle()
}