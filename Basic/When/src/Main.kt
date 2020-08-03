fun main() {
    val a1 = 2
    // 기존 switch
    when(a1){
        1 -> println("a1은 1입니다.")
        2 -> {
            println("여러줄이 필요하다면")
            println("a1은 2입니다.")
        }
        3 -> println("a1은 3입니다.")
        else -> println("1,2,3이 아닙니다.")
    }

    val a2 = 3
    when(a2){
        1, 2 -> println("a2는 1이거나 2입니다.")
        3, 4 -> println("a2는 3이거나 4입니다.")
        else -> println("a2는 1,2,3,4가 아닙니다.")
    }
    // Int, Float, String 다 가능하다.

    val a3 = 3
    when(a3){
        in 1..3 -> println("a3은 1 ~ 3사이의 숫자입니다.")
        in 4..6 -> println("a3은 4 ~ 6사이의 숫자입니다.")
        in 1..6 -> println("a3은 1 ~ 6사이의 숫자입니다.")
        else -> println("a3은 1 ~ 6사이의 숫자가 아닙니다.")
    }

    println("str1 : ${setValue(1)}")
    println("str2 : ${setValue(2)}")
    println("str3 : ${setValue(3)}")
}

fun setValue(a1 : Int) = when(a1){
    1 -> "1"
    2 -> "2"
    else -> "그 이외"
}