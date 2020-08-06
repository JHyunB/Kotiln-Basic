fun main() {
    val obj1 = TestClass1()
    testFun1(obj1)
    testFun2(obj1)
}

interface Inter1{
    fun inter1Method1(){
        println("Inter1의 inter1Method1")
    }
    fun inter1Method2()
}

interface Inter2{
    fun inter2Method1(){
        println("Inter2의 inter1Method1")
    }
    fun inter2Method2()
}

fun testFun1(obj1:Inter1){
    obj1.inter1Method1()
    obj1.inter1Method2()
}

fun testFun2(obj1:Inter2){
    obj1.inter2Method1()
    obj1.inter2Method2()
}

class TestClass1 : Inter1, Inter2{
    override fun inter1Method2() {
        println("TestClass1의 inter1Method2")
    }

    override fun inter2Method2() {
        println("TestClass1의 inter2Method2")
    }

}