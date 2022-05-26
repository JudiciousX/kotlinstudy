//惰性初始化
class Player5 (_name:String) {
    var name = _name

    //惰性初始化 懒汉式 等到三秒后在执行loadConfig()
    //val config by lazy { loadConfig() }
    //饿汉式 先执行loadConfig() 3秒后执行println(p.config)
    val config = loadConfig()

    private fun loadConfig() : String{
        println("loading...")
        return "xxx"
    }
}

fun main() {
    var p = Player5("Jack")
    //线程睡3秒
    Thread.sleep(3000)
    println(p.config)
}