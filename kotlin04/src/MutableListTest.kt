//可变集合
fun main() {
    val mutableList = mutableListOf("Jason", "Jack", "Jacky")
    //mutableList.add("Jimmy")
    //mutableList.remove("Jack")




    //不可变转可变
    listOf("Jason", "Jack", "Jacky").toMutableList()
    //可变转不可变
    mutableListOf("Jason", "Jack", "Jacky").toList()

    //跟add是一样的效果
    mutableList += "Jimmy"
    mutableList -= "Jason"

    //如果字符串中包含jack 就移除这个字符串
    mutableList.removeIf{ it.contains("Jack")}

    println(mutableList)
}