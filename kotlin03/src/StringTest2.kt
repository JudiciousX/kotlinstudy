//字符串比较
fun main() {
    val str1 = "Jason"
    val str2 = "jason".capitalize()
    val str3 = "Jason"
    val str4 = "jason".capitalize()
    println(str1 == str2)       //比较字符是否相等  ture
    println(str1 === str2)      //比较是否指向内存堆上同一个对象  false
    println(str1 === str3)      //true
    println(str2 === str4)      //false  字符串操作时每次都会重新创建一个对象

    //字符串遍历
    "The people's Republic of China.".forEach {
        println("$it")
    }
}