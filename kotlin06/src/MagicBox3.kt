//多泛型函数
class MagicBox3<T> (item: T) {
    var available = false
    private var subject:T = item

    fun fetch():T? {
        //takeIf当表达式返回true时 它会返回接收者对象 如果时false 返回空
        return subject.takeIf { available }
    }

    //泛型函数 关键字fun后加上<X>的才是泛型函数 返回值是T的不是泛型函数
    //return -> R
    //业务 把元素进行修改 将T的一个类型变为另一个类型
    fun <R> fetch(subjectModFunction: (T) -> R): R? {
        return subjectModFunction(subject).takeIf { available }
    }
}

class Boy3(val name:String, val age:Int)

class Man(val name:String, val age:Int)


fun main() {
    val magicBox = MagicBox3(Boy3("Jack", 20))

    magicBox.available = true
    magicBox.fetch()?.run {
        println("you find $name")
    }

    val man = magicBox.fetch {
        Man(it.name, it.age.plus(15))
    }
}