fun main() {
    val str1 = "abcd"
    // String에 getUpperString 함수가 있는것처럼
    println(str1.getUpperString())
}

// 기존 클래스에 메소드를 추가하는것처럼 보이지만 사실은 아님. 자바코드로 변환해서 확인
fun String.getUpperString() : String{
    return this.toUpperCase()
}