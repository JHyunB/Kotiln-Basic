fun main() {
    // 자식 클래스 객체
    val obj1 = SubClass1()
    println("obj1.subA1 : ${obj1.subA1}")
    obj1.subMethod1()
    println("obj1.superA1 : ${obj1.superA1}")
    obj1.superMethod1()
    // 부모 자식 멤버 변수 및 함수 모두 사용가능

    // 부모 클래스 참조형 객체에 초기화
    val obj2:SuperClass1 = obj1
    println("obj2.superA1 : ${obj2.superA1}")
    obj2.superMethod1()
    // 오류, 부모클래스에만 접근 가능
    // println("obj2.subA1 : ${obj2.subA1}")
    // obj2.subMethod1()
    println("---------------------------------")

    //오버라이딩
    val obj3:SubClass2 = SubClass2()
    obj3.superMethod2()

    val obj4:SuperClass2 = obj3
    obj4.superMethod2() // 자식클래스의 메소드가 호출 됨.
    println("---------------------------------")

    val obj5:SuperClass3 = SuperClass3()
    overridingTest(obj5)

    val obj6:SubClass3 = SubClass3()
    overridingTest(obj6)
}

open class SuperClass1{
    var superA1 = 100

    fun superMethod1(){
        println("SuperClass1의 superMethod1")
    }
}

class SubClass1 : SuperClass1(){
    var subA1 = 100

    fun subMethod1(){
        println("SubClass1의 superMethod1")
    }
}

open class SuperClass2{
    open fun superMethod2(){
        println("SuperClass2의 superMethod2")
    }
}

class SubClass2 : SuperClass2(){
    // 오버라이딩
    override fun superMethod2(){
        println("SubClass2의 superMethod2")
    }
}

open class SuperClass3(){
    open fun superMethod3(){
        println("SuperClass3의 superMethod3")
    }
}

class SubClass3 : SuperClass3(){
    // 오버라이딩
    override fun superMethod3(){
        super.superMethod3()
        println("SubClass3의 superMethod3")
    }
}

fun overridingTest(obj1:SuperClass3){
    obj1.superMethod3()
}