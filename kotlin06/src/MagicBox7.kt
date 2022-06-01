//reified 具体化 保留泛型
class MagicBox6<T : Human6> {
    //随机产生一个对象，如果不是指定类型的对象 就通过backup函数产生一个指定类型的对象
    //inline和reified一起使用
    inline fun<reified T> randomOrBackup(backup: () -> T): T {
        val items = listOf(
            Boy6("Jack", 20),
            Man6("John", 35)
        )

        val random = items.shuffled().first()

        println(random)
        //kotlin不允许对泛型参数做类型检查 泛型擦除 在运行时不可知（java） Kotlin可知
        return if(random is T) {
            random
        }else {
            backup()
        }
    }
}

open class Human6(val age:Int)

class Boy6(val name:String, age:Int):Human6(age) {
    override fun toString(): String {
        return "Boy6(name='$name',age='$age')"
    }
}

class Man6(val name:String, age: Int):Human6(age) {
    override fun toString(): String {
        return "Man6(name='$name',age='$age')"
    }
}

fun main() {
    //这里的Man6是MagicBox6的泛型
    val box1:MagicBox6<Man6> = MagicBox6()
    //根据这里的类型来推断randomOrBackup的泛型
    //由backup函数，推断出T的类型
    val subject = box1.randomOrBackup {
       Boy6("Jimmy", 30)
    }
    println(subject)
}
