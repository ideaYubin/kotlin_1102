package chap04.section1

class Person6(val name: String, val age: Int)
fun main(){
    var isPersonInstantiated: Boolean = false

    val person6 : Person6 by lazy {
        isPersonInstantiated = true
        Person6("Kim", 23)
    }
    val personDelegate = lazy { Person6("Hong", 40) }

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person6.name}")
    println("personDelegate.value.name = ${personDelegate.value.name}")

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}