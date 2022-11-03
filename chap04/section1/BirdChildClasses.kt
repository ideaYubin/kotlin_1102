package chap04.section1

open class Bird8(var name:String, var wing:Int, var beak: String, var color: String){
    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}
//주 생성자를 사용하는 상속
class Lark(name: String, wing: Int, beak: String, color: String) : Bird8(name, wing, beak, color) {
    fun singHitone() = println("Happy Song!")
}
//부 생성자를 사용하는 상속
class Parrot : Bird8{
    val language: String

    constructor(name: String, wing: Int, beak: String, color: String, language: String) : super(name, wing, beak, color) {
        this.language = language //새로 추가된 프로퍼티
    }
    fun speak() = println("Speak! $language")
}

fun main() {
    val coco = Bird8("mybird", 2, "short", "blue")
    val lark = Lark("mylark", 2, "long", "brown")
    val parrot = Parrot("myparrot", 2, "short", "multiple", "korean") //프로퍼티가 추가됨

    println("Coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")

    lark.singHitone()
    parrot.speak()
    lark.fly()
}