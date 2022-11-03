package chap04.section1

import kotlin.properties.Delegates

class User41{
    var name: String by Delegates.observable("NONAME"){
        prop, old, new ->
        println("$old -> $new")
    }
}
fun main() {
    val user = User41()
    user.name = "Kildong"
    user.name = "Dooly"
}