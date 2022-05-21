//let
fun main() {
    val result = listOf(3,2,1).first().let {
        it * it
    }
    println(result)  //9
    println(format("viper"))
}

//链式调用风格
fun format(guestName:String?):String{
    return guestName?.let {
        "welcomt, $it"      //let返回最后一行
    }?:"What's your name"
}