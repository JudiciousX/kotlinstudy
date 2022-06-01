//产生1000个素数
fun Int.isPrime() : Boolean {
    (2 until this).map {
        if(this % it == 0) {
            return false
        }
    }
    return true
}

fun main() {
    val toList = (1..5000).toList().filter{ it.isPrime() }.take(1000)
}