fun main() {
    val r1 = testFun1(100,200)
    println("r1 : $r1")

    val r2 = testFun2(100,200)
    println("r2 : $r2")

    // 람다식
    val lambda1 = {a1:Int, a2:Int -> a1 + a2}
    val r3 = lambda1(100,200)
    println("r3 : $r3")

    val lambda2 = {a1:Int, a2:Int ->
        val r1 = a1 + a2
        val r2 = a1 - a2
        r1 * r2
    }
    val r4 = lambda2(100,200)
    println("r4 : $r4")

}

fun testFun1(a1:Int, a2:Int):Int{
    return a1 + a2
}

fun testFun2(a1:Int, a2:Int) = a1 + a2

