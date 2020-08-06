fun main() {
    val obj1 = TestClass1()
    obj1.testMethod1()

    val obj2 = Subclass()
    obj2.subMethod1()
}

class TestClass1(var a2:Int){
    var a1 = 100
    // this로 주생성자 호출
    constructor() : this(100){

    }
    fun testMethod1(){
        var a1 = 200
        // this를 통해 멤버변수 접근 가능
        println("a1 : ${this.a1}")

        fun testMethod2(){
            println("testMethod1 내부의 testMethod2")
        }

        // this를 통해 구분 가능
        testMethod2()
        this.testMethod2()
    }

    fun testMethod2(){
        println("testMethod2")
    }
}

open class SuperClass(var a2: Int){
    open var a1 = 100

    open fun superMethod1(){
        println("SuperClass의 superMethod1")
   }
}

class Subclass : SuperClass(100){

    // 변수도 오버라이딩
    override var a1 = 1000
    override fun superMethod1() {
        println("SubClass의 superMethod1")
    }
    fun subMethod1(){
        println("a1 : $a1")
        // super를 통해 부모 클래스 멤버 접근
        println("super.a1 : ${super.a1}")
    
        // super를 통해 부모 메소드 접근
        superMethod1()
        super.superMethod1()
    }
}

class SubClass : SuperClass{
    // 부모 생성자 호출
    constructor(a1:Int) : super(a1){

    }
    constructor(a1:Int, a2:Int) : super(a2){

    }
}