package OOP.Generic

// Class
class Box<T : Number>(var content: T) {
    fun gotContent(): T {
        return content
    }

    fun changeContent(newContent: T) {
        content = newContent
    }
}

// function
fun <T : Number> List<T>.total(): Double = run {
    return this.fold(0.0){acc, it -> acc + it.toDouble()}
}

fun main(){
    val box1 = Box<Int>(3)
    val box2 = Box<Double>(2.0)
//    val box3 = Box<String>("Hello") // cannot

    val myList1 = listOf(1,2,3,4,5)
    val myList2 = listOf("hello","world")

    println(myList1.total())
//    println(myList2.total()) // cannot
}