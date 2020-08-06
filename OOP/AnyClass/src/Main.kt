fun main() {
    // Any 모든 클래스의 부모 클래스
    val obj1 = TestClass1()
    val obj2 = TestClass2()
    val obj3 = TestClass3()

    testFunction1(obj1)
    testFunction1(obj2)
    testFunction1(obj3)
}


class TestClass1(){
    override fun toString(): String {
        return "TestClass1의 객체"
    }
}

class TestClass2(){
    override fun toString(): String {
        return "TestClass2의 객체"
    }
}

class TestClass3(){
    override fun toString(): String {
        return "TestClass3의 객체"
    }
}

fun testFunction1(a1:Any){
    println("a1 : $a1")
}