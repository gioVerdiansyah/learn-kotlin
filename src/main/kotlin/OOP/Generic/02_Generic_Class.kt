package OOP.Generic

//Without generics
class FirstBox(var content: String) {
    fun gotContent(): String {
        return content
    }

    fun putContent(newContent: String) {
        content = newContent
    }
}

//with generics
class SecondBox<T>(var content: T) {
    fun gotContent(): T {
        return content
    }

    fun putContent(newContent: T) {
        content = newContent
    }
}

fun main() {
//    Without generics
    val firstBox = FirstBox("Black Box")
    println("FirstBox content: ${firstBox.gotContent()}")
    firstBox.putContent("White Box")
    println("FirstBox content: ${firstBox.gotContent()}")

//    With generics
    val secondBox = SecondBox<Int>(123) // now we can customize the type
    println("SecondBox content: ${secondBox.gotContent()}")
    secondBox.putContent(125)
    println("SecondBox content: ${secondBox.gotContent()}")
}