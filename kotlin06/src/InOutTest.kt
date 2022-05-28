//out
interface Production<out T> {
    fun product() : T
}

//in
interface Consumer<in T> {
    fun consumer(item: T)
}

//不变
interface ProductionConsumer<T> {
    fun product(): T
    fun consumer(item: T)
}

open class Food

open class FastFood: Food()

class Burger : FastFood()

//生产者
class FoodStore: Production<Food> {
    override fun product(): Food {
        println("Produce food.")
        return Food()
    }
}

//快餐商店
class FastFoodStore: Production<FastFood> {
    override fun product(): FastFood {
        println("Produce FastFood.")
        return FastFood()
    }
}

//汉堡商店
class BurgerStore: Production<Burger> {
    override fun product(): Burger {
        println("Produce Burger.")
        return Burger()
    }
}

//消费者
class Everybody : Consumer<Food> {
    override fun consumer(item: Food) {
        println("Eat Food.")
    }
}

class ModernPeople : Consumer<FastFood> {
    override fun consumer(item: FastFood) {
        println("Eat FastFood.")
    }
}

class American : Consumer<Burger> {
    override fun consumer(item: Burger) {
        println("Eat burger.")
    }
}


fun main() {
    //赋值
    //子类泛型对象可以赋值给父类泛型对象，用out
    val production: Production<Food> = FoodStore()
    //java中不允许这么做 但在kotlin中使用out可以
    //java只支持普通类型的协变,不支持泛型协变,因为运行时会发生泛型擦除
    //out产生协变,可以达成泛型声明父类,实际使用子类的效果
    val production2: Production<Food> = FastFoodStore()

    //父类泛型对象可以赋值给子类泛型对象，用in
    val consumer1: Consumer<Burger> = Everybody()
    val consumer2: Consumer<Burger> = American()
    //这里只能传入Burger
    consumer1.consumer(Burger())        //Eat Food. 实际还是Everybody()类型
}