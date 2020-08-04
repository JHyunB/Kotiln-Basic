// 모듈 : 패키지들을 모아서 관리
// 다른 모듈을 사용하려면 등록해야한다.
// intellij File-project structure-Modules-Dependencies-Module Dependency
import kr.co.jonghyun.module.pkg1.TestClass1
import kr.co.jonghyun.module.pkg1.TestClass2
import kr.co.jonghyun.module.pkg2.TestClass3
import kr.co.jonghyun.module.pkg2.TestClass4

fun main() {
    val obj1 = TestClass1()
    val obj2 = TestClass2()
    val obj3 = TestClass3()
    val obj4 = TestClass4()

    obj1.testMethod1()
    obj2.testMethod2()
    obj3.testMethod3()
    obj4.testMethod4()
}