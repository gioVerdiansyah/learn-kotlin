package OOP.Generic


fun main(){
//    Basically compiler automatically know type
    val myList = listOf(1,2,3,4,5)

//    But if we put type, we just only can put the corresponding type
    val stringList = listOf<String>("Hello", "Kotlin")

//    We must give a type when we want to create a list variable without directly adding its value
    val zeroList = listOf<Int>() // this to be a reference for the compiler

//    We can also declare more than one parameter type for class. Example Map
    val myMap = mapOf<String, Int>("point" to 99, "age" to 23, "salary" to 99999)

//    or we can abbreviate
}