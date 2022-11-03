package chap04.section1

open class Person1 {
    constructor(firstName: String) {
        println("[person] firstName: $firstName")
    }
    constructor(firstName: String, age: Int) {
        println("[person] firstName: $firstName, $age")
    }
}
class Developer1: Person1 {
    constructor(firstName: String): this(firstName, 10){
        println("[Developer] $firstName")
    }
    constructor(firstName: String, age: Int): super(firstName, age){
        println("[Developer] $firstName, $age")
    }
}
fun main() {
    val miso = Developer1("miso")
}