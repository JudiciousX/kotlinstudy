/*
//扩展函数 不能重复定义
//给字符串追加若干个感叹号
fun String.addExt(amount: Int = 1) = this + "!".repeat(amount)
//在超类上定义函数
fun Any.easyPrint() = println(this)

fun main() {
    println("ac".addExt())
    "anv".easyPrint()
}*/
