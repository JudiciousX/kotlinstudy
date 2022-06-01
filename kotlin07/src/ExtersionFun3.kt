//扩展属性
//demo 给字符串提供一个可扩展的属性 统计元音字母个数 重写get方法
val String.numVowels
    get() = count{ "aeiou".contains(it)}

fun main() {
    //打印String.numVowels的值 调用get方法获取值
    println("The people's Republic of China".numVowels)
    "The people's Republic of China".numVowels.easyPrint()
}