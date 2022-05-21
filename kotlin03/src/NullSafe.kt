//可空性
fun main() {
    var str:String? = "scout"       //可空字符串类型
    str = null
    //str?.capitalize()  //?.安全调用操作符 当str为空时自动跳过这个函数
    //不为空才会调用后面的let函数 为空不调用
    str = str?.let {
        //非空白字符串
        if(it.isNotBlank()) {
            it.capitalize()
        }else {
            "scout"
        }
    }
    //使用非空断言操作符 当str为空时 会抛出异常
   // str = str!!.capitalize()

    //if判断
    if(str != null) {
        str.capitalize()
    }else {
        print("为空")
    }
    //使用安全操作符链式调用
    str?.capitalize().plus("is good")

    //空合并操作符 ?: 如果左边为空 输出右边的值 如果不为空 输出str
    println(str ?: "viper")

    //可以和let函数一起使用来代替if/else语句
    str = str?.let { it.capitalize() } ?: "viper"

    println(str)
}