//单例
object ApplicationConfig {
    init {
        println("ApplicationConfig loading...")
    }

    fun doSomething() {
        println("doSomething")
    }
}

fun main() {
    //既是类名也是实例名
    ApplicationConfig.doSomething()

    //单例模式 两个ApplicationConfig所代表的值一致
    println(ApplicationConfig)
    println(ApplicationConfig)
}