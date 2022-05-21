//异常
import java.lang.IllegalArgumentException

fun main() {
    var num: Int? = null

    //处理异常
    try {
        checkOperation(num)
        num!!.plus(1)
    }catch (e : Exception) {
        println(e)
    }

}
//抛出异常
fun checkOperation(num: Int?) {
    //num ?: throw UnskilledException()
    checkNotNull(num, {"Something is not good"})
}

//自定义异常
class UnskilledException() : IllegalArgumentException("操作不当")