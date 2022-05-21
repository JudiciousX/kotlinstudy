//with函数
fun main() {
    //run和with比较 只是传参方式不同
    val result1 = "The people's Republic of China".run {
        length >= 10
    }
    val result2 = with("The people's Republic of China"){
        length >= 10
    }
}