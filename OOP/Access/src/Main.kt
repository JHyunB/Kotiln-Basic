import kr.co.jonghyun.module.pkg2.PublicClass3
import kr.co.jonghyun.module.pkg2.TestClass3
import kr.co.jonghyun.pkg1.InternalClass2
import kr.co.jonghyun.pkg1.PublicClass2
import kr.co.jonghyun.pkg1.TestClass2

fun main() {
    // private은 외부에서 사용 불가능
    // val obj1 = PrivateClass1()
    val obj2 = PublicClass1()
    // internal은 같은 모듈 내 사용 가능
    val obj3 = InternalClass1()

    // 다른 패키지 클래스
    val obj5 = PublicClass2()
    val obj6 = InternalClass2()

    // 다른 모듈 클래스
    val obj8 = PublicClass3()
    // internal은 다른 모듈에서 사용 불가능
    // val obj9 = InternalClass3()


    // 변수, 함수 접근제한자 테스트
    val t1 = TestClass1()
    // private 멤버  사용 불가능
    // println("t1.private : ${t1.priavate1}")
    println("t1.public1 : ${t1.public1}")

    // protected 멤버 상속관계가 아니므로 사용 불가능
    // println("t1.protected1 : ${t1.protected1}")
    println("t1.internal1 : ${t1.internal1}")

    // 다른 패키지 클래스
    val t2 = TestClass2()
    println("t1.public1 : ${t2.public2}")
    println("t1.internal1 : ${t2.internal2}")

    // 다른 모듈 클래스
    val t3 = TestClass3()
    println("t1.public1 : ${t3.public3}")
    // internal 다른 모듈에서 사용 불가능
    // println("t1.internal1 : ${t3.internal3}")
}

// 같은 패키지 클래스 상속
class SubClass1 : TestClass1(){
    fun subMethod1(){
        // println("private1 : $private1")
        println("public1 : $public1")
        println("protected1 : $protected1")
        println("internal1 : $internal1")
    }
}

// 다른 패키지 클래스 상속
class SubClass2 : TestClass2(){
    fun subMethod1(){
        // println("private2 : $private2")
        println("public2 : $public2")
        println("protected2 : $protected2")
        println("internal2 : $internal2")
    }
}

// 다른 모듈 클래스 상속
class SubClass3 : TestClass3(){
    fun subMethod1(){
        // println("private3 : $private3")
        println("public3 : $public3")
        println("protected3 : $protected3")
        // println("internal3 : $internal3")
    }
}