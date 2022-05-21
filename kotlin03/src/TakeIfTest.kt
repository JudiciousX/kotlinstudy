import java.io.File
//takeIf
fun main() {
    //如果takeIf返回true就返回接收者对象 如果为false 返回null
    val result = File("C:\\Users\\judicious\\Desktop\\1.txt")
        .takeIf { it.exists() && it.canRead() }
        ?.readText()

    println(result)

}