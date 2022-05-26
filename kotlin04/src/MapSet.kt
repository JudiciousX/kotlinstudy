//map集合
fun main() {
    //根据to创建map
    //to是一个函数 将它左边和右边的值转化为一对Pair
    val map = mapOf("Jack" to 20, "Jason" to 18, "Jack" to 30)

    //可以直接根据Pair创建map
    mapOf(Pair("Jimmy", 10))

    println(map["Jack"])
    println(map.getValue("Jack"))
    println(map.getOrElse("Rose"){"UnKnown"})       //如果没有 返回值就用lambda表达式的值 也就是Unknown
    println(map.getOrDefault("Rose", 0))    //如果没有元素 返回值为第二个参数（默认值） 0

    //forEach遍历
    map.forEach{
        print("${it.key}, ${it.value}")
    }

    map.forEach{ (keyS: String, value: Int) ->
        println("$keyS, $value" )

    }
}