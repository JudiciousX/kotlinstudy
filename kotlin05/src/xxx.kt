fun main() {
    var map = mutableMapOf("帅次" to 18).apply {
        put("apply-北京",188)
        put("apply-上海",288)
    }.apply {
        put("apply-南京",188)
        put("apply-天京",288)
    }
/*
    var map = mutableMapOf("帅次" to 18).also {
        it.put("apply-天京", 288)
    }*/

    println(map)
}