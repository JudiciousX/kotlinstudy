//伴生对象
import java.io.File

open class ConfigMap {
    //只要调用ConfigMap.load()函数 或者实例化它 伴生对象才会创建
    //无论ConfigMap实例化多少次 伴生对象只存在一次 也就是单例的
    companion object{
        private const val PATH = "xxx"

        fun load() = File(PATH).readBytes()
    }
}

fun main() {
    //static实现 但是和Java中的不同 你不调用它就不会实例化出来
    ConfigMap.load()
}