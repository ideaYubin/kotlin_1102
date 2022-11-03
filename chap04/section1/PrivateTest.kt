package chap04.section1

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        println(i)
        i += 1 //접근 허용
        println(i)
    }

    fun access() {
        privateFunc() //접근 허용
    }
}
class OtherClass {
    private val opc = PrivateClass()
    fun test() {
        val pc = PrivateClass() // 생성가능
    }
}
fun TopFunction() {
    val tpc = PrivateClass() // 객체생성 가능
}
fun main() {
    val pc = PrivateClass()
    /*pc.i
    pc.privateFunc()*/
    pc.access()
}
