fun main() {
    //使用匿名函数给标准函数制定规则
    val total = "Mississippi".count({ it == 's' })
    //第一个letter是变量 下一行是函数体
    val totalS = "Mississippi".count { it == 's' }
    println(total)
    println(totalS)

    //变量的类型是一个匿名函数 无参 返回字符串类型的匿名函数
    val blessingFunction: () -> String = {
        val holiday = "New Year."
        "Happy $holiday"
        //一般情况下把最后一句代码返回
    }
    println(blessingFunction)   //() -> kotlin.String
    println(blessingFunction())     //Happy New Year.

    //匿名函数有参数时
    val blessingFunction2:(String) -> String = { name ->
        val holiday = "New Year."
        "$name and $holiday"
        //一般情况下把最后一句代码返回
    }

    //it关键字
    val blessingFunction3:(String) -> String = {
        val holiday = "New Year."
        "$it and $holiday"
        //一般情况下把最后一句代码返回
    }


    //类型推断 不是代码块 是匿名函数 返回值类型推断
    val blessingFunction4 = {
        val holiday = "New Year."
        " and $holiday"
        //一般情况下把最后一句代码返回
    }

    //不使用类型推断
    val blessingFunc:(String, Int) -> String = {name, year ->
        val holiday = "New Year"
        "$name ,Happy $holiday $year"
    }

    //使用类型推断时  需要在传参的时候标清参数类型  参数类型推断
    val blessingFunc1 = {name:String, year:Int ->
        val holiday = "New Year"
        "$name ,Happy $holiday $year"
    }


    println(blessingFunc1("scount", 2021))
    println(blessingFunction4())  //scout and New Year.
}