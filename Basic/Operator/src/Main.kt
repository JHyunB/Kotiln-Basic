import sun.font.TrueTypeFont

fun main() {
    // 단항
    val a1:Int = 10
    val a2:Int = -10

    // +
    val b1:Int = +a1
    val b2:Int = +a2
    println("a1 : $a1, b1 : $b1")
    println("a2 : $a2, b2 : $b2")

    // -
    val b3:Int = -a1
    val b4:Int = -a2
    println("a1 : $a1, b3 : $b3")
    println("a2 : $a2, b4 : $b4")

    // !
    val a3:Boolean = true
    val a4:Boolean = false
    val b5:Boolean = !a3
    val b6:Boolean = !a4
    println("a1 : $a3, b5 : $b5")
    println("a2 : $a4, b6 : $b6")

    // 나머지 연산들은 알고 있던것과 동일
}