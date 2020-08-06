fun main() {
    // 추상클래스는 객체 생성 X
    // val obj1 = Super1()
    // testFun1(obj1)
    val obj2 = Sub1()
    testFun1(obj2)

    val obj3 = Sub2()
    testFun1(obj3)
}

open abstract class Super1{
    fun method1(){
        println("super1의 method1")
    }
    open abstract fun method2()
}

class Sub1 : Super1(){
    override fun method2() {
        println("sub1의 method2")
    }
}

class Sub2 : Super1(){
    // 추상 메소드는 꼭 구현해야함
    override fun method2() {
        TODO("Not yet implemented")
    }
}
fun testFun1(obj1:Super1){
    obj1.method1()
    obj1.method2()
}