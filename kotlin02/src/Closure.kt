fun main() {
    val getdiscountWords = configDiscountWords()
    println(getdiscountWords("viper"))
}

fun configDiscountWords(): (String) -> String {
    val currentYear = 2002
    val hour:Int = (1..24).shuffled().last()
    return { goodName:String ->
        "${currentYear}年, $goodName $hour"
    }
}