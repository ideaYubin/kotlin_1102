package chap04.section3

fun labelContinue() {
    println("labelContinue")
    for(i in 1..5){
        second@ for (j in 1..5){
            if(j ==3) continue
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}