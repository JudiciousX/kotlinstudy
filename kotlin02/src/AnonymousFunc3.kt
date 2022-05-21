////定义一个函数是另一个函数的参数
//fun main() {
//    showOnBoard("xxx") { goodName: String, hour: Int ->
//        val currentYear = 2002
//        "$currentYear 年"  //中间有空格 没有空格就会将后面的字符当作变量名
//        "${currentYear}年, $goodName $hour"  //带括号后可以不用空格
//    }
//
//}
//
////具名函数
//private fun showOnBoard(goodName: String, getWords:(String, Int) -> String) {
//    val hour:Int = (1..24).shuffled().last()
//    println(getWords(goodName, hour))
//
//}
