package chap04.section1

class Bird { //클래스의 정의
    // 프로퍼티
    var name : String = "mybird"
    var wing : Int = 2
    var beak : String = "short"
    var color : String = "blue"

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}
fun main() {
    val coco = Bird()
    coco.color = "red"

    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}