package OOP

// Error because Int is a final class
//class NewInt: Int(){
//    fun printInt(){
//        print("Value is $this")
//    }
//}

// Function / Method
fun Int.printInt(){
    print("Value is $this")
}

// Property
val Int.isOdd : Boolean
    get() = this % 2 == 0

// Infix function

// without infix
fun Int.divider(value: Int): Int {
    return this / value
}

infix fun Int.rem(value: Int): Int {
    return this % value
}

// 1. Infix function must be a member function or extension function.
// 2. It must have only one parameter.
// 3. The parameter must not be generic and must not have a default value.

class MyHero {
    infix fun addHero(s: String) {
        println("Welcome $s")
    }

    fun build() {
        this addHero "Superman"   // Correct
        addHero("Spidermen")       // Correct
        //  addHero "Ironman"        // Incorrect: the receiver must be specified
    }
}

infix fun Int?.mul(value: Int): Int {
    return this?.times(value) ?: 0
}

fun main(){
    100.printInt()
    println()
    println(if (15.isOdd) "Yes" else "No")
    println(20.divider(2))
    println(33 rem 2)

    val myHero = MyHero()
    myHero.build()

//    Null receiver
    val myNum: Int? = null
    println(myNum.mul(5))
}