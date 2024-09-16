fun useWhen(value: Int) {
    when (value) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> {
            println("Value is Invalid")
            println("Please enter value between 1,2,3,4,5")
        }
    }
}

fun whenType(value: Any){
    when(value){
        is String -> println("Type is String!!!")
        is Int -> println("Type is Int!!!")
        else -> println("Type is not String or Int!!!")
    }
}

fun isInRange(value: Int, start: Int, end: Int) : Boolean {
    val ranges = start..end
    return when (value) {
        in ranges -> true
        !in ranges -> false
        else -> false
    }
}

fun main() {
//    useWhen(10)
//    whenType(1)
    println("2 is in range 10..20: ${isInRange(value = 2,10,20)}")
}