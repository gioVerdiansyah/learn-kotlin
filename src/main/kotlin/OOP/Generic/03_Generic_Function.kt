package OOP.Generic

fun <T> List<T>.cut(indices: Iterable<Int>): List<T>{
    return this.slice(indices)
}

fun main(){
    val myNums: List<Int> = (1..100).toList()
    val sliceNums: List<Int> = myNums.cut<Int>(1..10)

    println(sliceNums)
}
