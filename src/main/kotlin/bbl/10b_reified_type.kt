package bbl


object ObjectCache {
    var cache = emptyMap<Class<out Any>, Any>()


    fun register(bean: Any): Unit {
        cache += bean::class.java to bean
    }
}

inline fun <reified T> getBean(): T {
    return ObjectCache.cache[T::class.java] as T
}

data class HelloWorld(val example: String = "hello", val number: Int = 12345)


fun main(args: Array<String>) {
    ObjectCache.register("hello world")
    ObjectCache.register(HelloWorld())

    val str: String = getBean()
    println(str)

    val hello: HelloWorld = getBean()
    println(hello)


}