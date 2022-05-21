//函数引用
fun main() {
    //要获得函数引用，使用::操作符，后跟要引用的函数名
    showOnBoard("viper", ::getDiscountWords)
}

private fun getDiscountWords(goodName: String, hour:Int):String {
    val currentYear = 2002
    return "${currentYear}年, $goodName $hour"
}
//具名函数
private fun showOnBoard(goodName: String, getDiscountWords: (String, Int) -> String) {
    val hour:Int = (1..24).shuffled().last()
    println(getDiscountWords(goodName, hour))
}