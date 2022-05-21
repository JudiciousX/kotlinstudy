import kotlin.math.roundToInt

//数据类型
fun main() {

    //val num2:Int = "8.98".toInt()  //会抛出异常 NumberFormatException 没法将string转成int

    val num1:Int? = "8.98".toIntOrNull()        //返回null 没有转成功返回空
    println(num1)

    //double转int
    println(8.956789.toInt())       //double转int会丢失小数点后 精度损失  8
    println(8.956789.roundToInt())      //四舍五入转int  9

    //double类型格式化
    println("%.2f".format(8.9866))      //返回的是字符串 且会四舍五入 8.99
}