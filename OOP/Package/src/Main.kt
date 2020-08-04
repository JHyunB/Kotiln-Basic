import kr.co.jonghyun.pkg1.TestClass2
import kr.co.jonghyun.pkg1.testFunction2
import kr.co.jonghyun.pkg2.*
// 패키지간의 이름 중복이 있으면 안됨.
// 클래스 이름 중복되지 않도록 만들면 신경 안써도 됨.

fun main() {
    val obj1:kr.co.jonghyun.pkg1.TestClass1 = kr.co.jonghyun.pkg1.TestClass1()
    obj1.testMethod1()
    kr.co.jonghyun.pkg1.testFunction1()

    // import할 경우 패키지 명시 생략 가능
    val obj2:TestClass2 = TestClass2()
    obj2.testMethod2()
    testFunction2()

    val obj3 = TestClass3()
    val obj4 = TestClass4()

    obj3.testMethod3()
    obj4.testMethod4()
}