fun main() {
    testFunc1()
    testFunc1()

    // 함수 구현 코드가 복사되어 실행
    // 함수 호출을 하지 않아 호출 오버헤드를 줄일 수 있다.
    // 바이트코드를 java코드로 디컴파일해보면 차이를 알 수 있음.
    testFunc2()
    testFunc2()
}

fun testFunc1(){
    println("---------------")
    println("testFun1")
    println("---------------")
}

// 인라인 함수
inline fun testFunc2(){
    println("---------------")
    println("testFun2")
    println("---------------")
}