import java.io.File
//apply函数  配置函数
fun main() {
    val file1 = File("C:\\Users\\judicious\\Desktop")
    file1.setReadable(true)
    file1.setWritable(true)
    file1.setExecutable(false)

    //apply函数 配置接收者对象 apply中的this和接收者对象是同一个对象
    val file2 = File("C:\\Users\\judicious\\Desktop").apply {
        setExecutable(true)
        setWritable(true)
        setReadable(true)
    }
}