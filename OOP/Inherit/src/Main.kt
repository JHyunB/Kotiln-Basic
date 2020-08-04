fun main() {
    val s1 = SubClass1()
    println("s1.subMember1 : ${s1.subMember1}")
    s1.subMethod1()

    // 부모클래스의 멤버변수 및 멤버메소드 접근 가능
    println("s1.superMember1 : ${s1.superMember1}")
    s1.superMethod1()


}

// 자바에선 final이 붙음
// class SuperClass1

// 부모클래스
open class SuperClass1{
    var superMember1 = 100

    constructor(){
        println("부모클래스 생성자 호출")
    }
    fun superMethod1(){
        println("SuperClass1의 메소드")
    }
}

// 부모클래스의 생성자는 항상 호출해줘야 함
class SubClass1 : SuperClass1{
    val subMember1 = 200
    constructor(){
        println("자식클래스 생성자 호출")
    }
    fun subMethod1(){
        println("SubClass1의 메소드")
    }
}

// 주 생성자 자동으로 멤버변수 추가
open class SuperClass2(val a1:Int)


// 아래 2개 방식 둘중 하나로 부모클래스 생성자 호출해야하긴함
class SubClass2 : SuperClass2(100)

class subClass3 :SuperClass2{
    constructor() : super(100)
}