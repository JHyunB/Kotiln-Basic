fun main() {
    // 함수를 파라미터로
    val t1 = fun(x1:Int, x2:Int) : Int{
        return x1 + x2
    }
    testFunc1(t1, 100, 200)

    testFunc1(fun(x1:Int,x2:Int) : Int{
        return x1 + x2
    },100,200)

    // 람다를 파라미터로로
    val lambda1 = {x1:Int, x2:Int -> x1 * x2}
    testFunc1(lambda1,100, 200)

    testFunc1({x1:Int, x2:Int -> x1 * x2}, 100, 200)

    // 리턴값이 함수
    val t2 = testFunc2()
    val r2 = t2(100, 200)
    println("r2 : $r2")

    // 리턴값이 람다
    val t3 = testFunc3()
    val r3 = t3(100, 200)
    println("r3 : $r3")

    testFunc4({x1:Int -> x1 + 100},100)
    testFunc4({it + 100}, 100) // 함수의 매개변수가 1개인 경우 가능

    testFunc5{println(it)}
}

fun testFunc1(m1:(Int,Int) -> Int, a1:Int, a2:Int){
    var r1 = m1(a1, a2)
    println("r1 : $r1")
}

// 함수를 리턴
fun testFunc2() : (Int,Int) -> Int {
    return fun(x1:Int, x2:Int) : Int{
        return x1 + x2
    }
}

// 람다 리턴
fun testFunc3() : (Int,Int) -> Int {
    return {x1:Int, x2:Int -> x1 + x2}
}

fun testFunc4(m1:(Int) -> Int, a1:Int){
    val r4 = m1(a1)
    println("r4 : $r4")
}

// 리턴이 없는 경우
fun testFunc5(m1:(Int) -> Unit){
    m1(100)
}