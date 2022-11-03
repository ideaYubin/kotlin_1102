package chap04.section1

class Person44 {
    var id: Int = 0
    var name: String = "Youngdeok"
    companion object {
        var language: String = "Korean"
        fun work() {
            println("working...")
        }
    }
}

fun main(){
    println("Person.language")
    Person44.language = "English"
    println(Person44.language)
    Person44.work()
}