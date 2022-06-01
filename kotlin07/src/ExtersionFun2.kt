//泛型扩展函数
fun String.addExt(amount: Int = 1) = this + "!".repeat(amount)
//在超类上定义函数
fun <T> T.easyPrint() :T {
    println(this)
    return this
}

fun main() {
    "abc".easyPrint().addExt(2).easyPrint()

    "abc".let {

    }

    //寻找集合中的素数
    val numbers = listOf(7,4,8,6,2,9,3)
    //filter中传入lambda表达式 (T) → Boolean 返回一个list集合
    //.map中也传入lambda表达式(T) → R  返回 List<R>
    //其中it是(2 until numbers)中的数字 后面none的it也一样 取的是返回的list集合中的数
    val primes = numbers.filter { numbers ->
        (2 until numbers).map { numbers % it }
            .none{ it == 0}
    }
    println(primes)

    //合并函数 如果两个集合长度不一样 取最短的长度
    val name = listOf("Jack", "Jim", "John", "Jack")
    val age = listOf(12,34,12,20)

    //有相同的元素时 后者覆盖前者
    val list = name.zip(age).toMap()

    println(list)
}