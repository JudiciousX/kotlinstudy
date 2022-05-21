import java.io.File
//also
fun main() {
    //可以链式调用 和let的区别 also返回接收者对象 let返回lambda表达式结果
    val fileContents: List<String>
    val file = File("C:\\Users\\judicious\\Desktop\\1.txt")
        .also {
            println(it.name)
        }.also {
            fileContents = it.readLines()
        }

    println(fileContents)
}