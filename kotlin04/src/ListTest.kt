//LIST集合
fun main() {
    val list:List<String> = listOf("Jason", "Jack", "Jacky")
    println(list[2])        //普通的按索引取元素 越界会报错
    println(list.getOrElse(3){"Unknown"})       //找不到元素会执行后面的lambda式
    println(list.getOrNull(3)?:"Unknown")       //找不到元素返回null  可以和安全操作符一起使用
}