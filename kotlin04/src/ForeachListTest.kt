//函数遍历
fun main() {
    val list = listOf("Jason", "Jack", "Jacky")
    //for循环
    for(s in list) {
        println(s)
    }
    //forEach
    list.forEach{
        print(it)
    }
    //遍历下标
    list.forEachIndexed{index, item ->
        println("$index, $item")
    }

    //_代表跳过当前元素 当前元素不使用 直接给下一个字符串赋值即可
    //将第一个元素赋值给origin 第二个元素不使用 第三个元素赋值给proxy
    //将集合中的元素赋值 可以比集合短
    val(origin:String,_:String) = list
    println("$origin")

}