fun main() {
    val obj1 = TestClass1()
    println("obj1 : $obj1")

    val obj2 = TestClass1()
    println("obj2 : $obj2") // 다른 메모리 주소

    val obj3 = obj1
    println("obj3 : $obj3")

    val obj4 = TestClass2()
    println("obj4.a1 : ${obj4.a1}")
    println("obj4.a2 : ${obj4.a2}")

    obj4.testMethod1()
    obj4.testMethod2()
}

// 내용이 없을 경우 class TestClass1 만 적어도 됨
// 뒤에서 자세히
class TestClass1{

}

class TestClass2{
    val a1 = 0
    val a2 = 0
    fun testMethod1(){
        println("testMethod1")
    }
    fun testMethod2(){
        println("testMethod2")
    }
}