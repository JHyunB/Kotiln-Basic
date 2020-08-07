fun main() {
    testFunction1()
    // 함수의 이름이 없어 함수의 주소값을 갖는 변수에 담아 이용
    // 고차함수와 관련이 깊음
    val testFunction2 = fun(){
        println("testFunction2")
    }
    testFunction2()
}

fun testFunction1(){
    println("testFunction1")
}