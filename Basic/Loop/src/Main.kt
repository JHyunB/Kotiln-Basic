fun main() {
    val a1 = 1..10
    for(item in a1){
        println("a1 : $item")
    }

    val a2 = 1..10 step 2
    for(item in a2){
        println("a2 : $item")
    }

    // val a3 = 10..1
    val a3 = 10 downTo 1
    for(item in a3){
        println("a3 : $item")
    }

    var a4 = 0
    while(a4 < 10){
        println("a4 : $a4")
        a4++
    }
}