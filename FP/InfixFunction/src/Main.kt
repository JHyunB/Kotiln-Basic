fun main() {

    val r1 = 100 add2  50
    println("r1 : $r1")

    val r2 = r1 add2 50
    println("r2 : $r2")

    val r3 = 100 minus2  50
    println("r3 : $r3")

    val r4 = r3 minus2 50
    println("r4 : $r4")
}

// 함수를 연산자처럼 사용
infix fun Int.add2(a1:Int) : Int{
    return this + a1
}

infix fun Int.minus2(a1:Int) : Int{
    return this - a1
}