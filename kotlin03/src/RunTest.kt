import java.io.File
//run函数
fun main() {
    val file = File("C:\\Users\\judicious\\Desktop\\1.txt")
    val result = file.run {
        readText().contains("a")      //超过2GB不会加载 查看文件内是否包含a
    }
    println(result)

    //::函数引用 返回的是最后一行
    val result1 = "capper viper scout".run(::isLong)
    println(result1)

    "capper viper scout"
        .run(::isLong)
        .run(::showMessage)
        .run(::println)
}

fun isLong(name:String) = name.length >= 10

fun showMessage(isLong: Boolean):String {
    return if(isLong) {
        "NAME IS LONG"
    }else {
        "PLEASE RENAME"
    }
}