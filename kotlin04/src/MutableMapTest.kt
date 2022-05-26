//可变的map集合
fun main() {
    val mutableMap = mutableMapOf("Jack" to 20, "Jason" to 18, "Jack" to 30)

    //向map中添加（Jimmy 20）
    mutableMap += "Jimmy" to 20
    //将前面的覆盖
    mutableMap.put("Jimmy", 30)

    //如果没有Rose 就添加一个 如果有就获取value
    mutableMap.getOrPut("Jimmy"){18}

    println(mutableMap)
}