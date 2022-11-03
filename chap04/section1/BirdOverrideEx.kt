package chap04.section1

open class Bird41(var name: String, var wing: Int, var beak: String, var color: String) {
    //메서드
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol") // 오버라이딩 가능한 메서드
}
class Parrot1(name: String, wing: Int = 2, beak: String, color:String,  var language: String = "natural") : Bird41(name, wing, beak, color) {
    fun speak() = println("Speak! $language") //Parrot 에 추가된 메서드
    override fun sing(vol: Int){ //오버라이딩된 메서드
        println("I'm a parrot! The volume level is $vol")
        speak() //달라진 내용!
    }
}
fun main() {
    val parrot1 = Parrot1(name = "myparrot", beak = "short", color = "multiple")
    parrot1.language = "English"
    println("Parrot: ${parrot1.name}, ${parrot1.wing}, ${parrot1.beak}, ${parrot1.color}, ${parrot1.language}")
    parrot1.sing(5) //달라진 메서드 실행 가능
}