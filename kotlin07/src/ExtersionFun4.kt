//可空类型扩展函数
//在函数内部进行可空判断
//String? 空安全操作符
infix fun String?.printWithDefault(default: String) = print(this ?: default)
//如果不为空 就打印str中的字符 如果为空 就答应参数中的字符
fun main() {
    val str: String? = null
    //如果在这里str后写空安全操作符 那么如果str为空 该方法不会被执行
    str printWithDefault "abc"
}