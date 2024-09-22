package OOP.Functional_Programming

// Member reference
// before
val sum: (Int, Int) -> Int = { a, b -> a + b }

// after
val calc: (Int, Int) -> Int = ::count
fun count(val1: Int, val2: Int): Int { // can place in anywhere
    return val1 + val2
}
// that call reflection mechanism

fun useBasic(){
    println(sum(10, 20))
    println(calc(5, 15))
}

// Function reference

fun filterEvenNums(num: Int) = num % 2 == 0
fun Int.oddNums() = this % 2 == 1

fun useReference(){
    val myNums: IntRange = 1..10
    val evenNums: List<Int> = myNums.filter(::filterEvenNums)
    val oddNums: List<Int> = myNums.filter(Int::oddNums)

    println(evenNums)
    println(oddNums)
}

// Property Reference
var myText: String = "Hello Kotlin"

fun usePropReference(){
    println(::myText.name)
    println(::myText.get())

    ::myText.set("Hello World") // because myText is mutable

    println(::myText.get())
}

fun main(){
//    useBasic()
//    useReference()
    usePropReference()
}