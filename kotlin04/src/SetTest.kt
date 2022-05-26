//set集合
fun main() {
    val set = setOf("Jason", "Jack", "Jacky", "Jack")
    //取第二号元素
    println(set.elementAt(2))

    //创建可变集合
    val mutableSet = mutableSetOf("Jason", "Jack", "Jacky", "Jack")
    mutableSet += "Jam"

    //将list转为set 去重
    val list = listOf("Jason", "Jack", "Jacky", "Jack")
        .toSet()
        .toList()
    println(list)

    //list转set快捷函数
    println(listOf("Jason", "Jack", "Jacky", "Jack").distinct())

}