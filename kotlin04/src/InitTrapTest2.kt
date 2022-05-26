//初始化陷进 赋值为空
class Player7(_name : String) {

    val playerName:String = initPlayerName()

    val name:String = _name

    private fun initPlayerName() = name


}
fun main() {
    //此时name为空
    println(Player7("Jack").playerName)

}