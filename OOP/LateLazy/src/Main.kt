fun main() {
    val obj1 = TestClass1()
    println("obj1.a1 = ${obj1.a1}")
    println("obj1.a2 = ${obj1.a2}")
    // println("obj1.a3 : ${obj1.a3}") 오류
    obj1.testMethod1()

    println("obj1.a4 : ${obj1.a4}")
}

class TestClass1{
    var a1:Int = 100
    var a2:Int
    // var 변수 초기화 미루기
    lateinit var a3:String

    // val의 경우 사용하려는 시점에 초기화가 됨.
    val a4:String by lazy{
        println("a4 init")
        "문자열2"
    }
    init{
        a2 = 200
    }
    fun testMethod1(){
        // :: 리플렉션
        if(!::a3.isInitialized){
            a3 = "문자열"
        }
        println("a3 : $a3")
    }
}