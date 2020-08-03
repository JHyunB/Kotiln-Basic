fun main() {
    println(100)
    println(10000000000)
    println(123_345_789)

    println(11.11)  // 8바이트
    println(22.22f) // 4바이트

    println("""동해물과 백두산이
        |마르고 닳도록
        |하느님이 보우하사
        |우리나라 만세
    """.trimMargin())

    val a1:Int = 100
    println("a1 : ${a1}")
    println("a1 : $a1")

    var a3:Int = 100
    val a4:Int = 100
    println("a3 : $a3")
    println("a4 : $a4")

    a3 = 200
    println("a3 : $a3")

    // a4 = 200 // val 이기 때문에 변경 불가능

    var a5:Int? = null // ? : null 허용

    // var a8:Int = a5!! // 오류발생

    test1()
    test2(100,55.55)

    val k1:Int = 100
    val k2:Double = 55.55
    test2(k1,k2)
    test3(k1,100)
    test4()
    test5()
}

fun test1(){
    println("test1 함수 호출")
}

fun test2(a1:Int, a2:Double = 22.22){
    println("test2 호출")
    println("a1 : $a1")
    println("a2 : $a2")
}
fun test3(a1:Int, a2:Int) : Int{
    return a1 + a2
}
// Unit java의 void 생략 가능
fun test4() : Unit{
    println("test4 호출")
}
fun test5(){
    println("test5 호출")
    fun test6(){
        println("test6 호출")
    }
    test6()
}
