//字符串
const val NAME = "Jimmy's friend"
const val NAMES = "Jack,jacky,jason"

fun main() {
    val index:Int = NAME.indexOf('\'')
    val str:String = NAME.substring(0, index)
    val str1:String = NAME.substring(0 until index)
    //根据传入参数进行拆分字符串 返回List集合
    val data:List<String> = NAMES.split(",")
    //解构语法
    val (orgin: String, dest:String, proxy:String) = NAMES.split(",")
    println("$orgin, $dest, $proxy")
    println(data[0])
    println(str)
    println(str1)

    //replace 替换字符
    val str2 = "The people's Republic of China."
    val str3 = str2.replace(Regex("[aeiou]")) {
        when(it.value) {
            "a" -> "8"
            "e" -> "6"
            "i" -> "9"
            "o" -> "1"
            "u" -> "3"
            else -> it.value
        }
    }

    println(str2)
    println(str3)
}