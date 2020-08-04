fun main() {
    val obj1 = TestClass1(100,200)
    println("obj1.a1 : ${obj1.a1}")
    println("obj1.a2 : ${obj1.a2}")

    obj1.a1 = 1000
    println("obj1.a1 : ${obj1.a1}")

    val obj2 = TestClass2()
    println("obj2.v1 : ${obj2.v1}")
    println("obj2.v2 : ${obj2.v2}")

    obj2.v3 = 5000
    println("obj2.v3 : ${obj2.v3}")
}


// java로 디컴파일 해보면 var는 getter와 setter, val은 getter가 생성됨을 알 수 있음
class TestClass1(var a1:Int, val a2:Int){
}

class TestClass2{
    var v1:Int = 0
    val v2:Int = 0
    var v3:Int = 100

    get(){
        println("get 호출")
        return field
    }
    set(value){
        println("set 호출")
        field = value
    }
}