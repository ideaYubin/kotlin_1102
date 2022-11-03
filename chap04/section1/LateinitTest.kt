package chap04.section1

class Person5 {
    lateinit var name: String
    fun test() {
        if(!::name.isInitialized){
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}

fun main() {
    val kildong = Person5()
    kildong.test()
    kildong.name = "Kildong"
    kildong.test()
    println("name = ${kildong.name}")
}