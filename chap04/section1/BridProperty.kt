package chap04.section1

class Bird7(var name:String, var wing:Int, var baek: String, var color:String){
    //프로퍼티 - 위에 var 혹은 val로 선언하므로서 프로퍼티가 이미 포함됨

    // 메서드
    fun fly() = println("Fly wing:$wing")
    fun sing(vol:Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird7("bird", 11, "long", "orange")
    println("coco.name: ${coco.name}, coco.wing ${coco.wing}")
    println("coco.color: ${coco.color}, coco.beak ${coco.baek}")
}