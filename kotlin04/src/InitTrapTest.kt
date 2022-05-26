//初始化陷进 没有赋值之前就使用该变量 出现空指针异常
class Player6() {

    val name:String

    private fun firstLetter() = name[0]

    init {
        //name为空 需要先赋值
        println(firstLetter())
        name = "Jack"
    }


}
fun main() {
    Player6()
}