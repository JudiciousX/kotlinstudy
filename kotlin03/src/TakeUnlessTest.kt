import java.io.File
//takeUnless 结果false时 才会返回原始接收对象
fun main() {
    val result = File("C:\\Users\\judicious\\Desktop\\1.txt")
        .takeUnless { it.isHidden }
        ?.readText()

    println(result)
}