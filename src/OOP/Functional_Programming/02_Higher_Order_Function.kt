package OOP.Functional_Programming

fun printVal(value: Int, sum: (Int) -> Int){
    println(sum(value))
}

fun callback(){
    val sum: (Int) -> Int = { it + it }
    printVal(5, sum)
    printVal(10) { it + it }
}

//
inline fun printCalc(value: Int, sum: (Int) -> Int){
    println(sum(value))
}

fun useInline(){
    printCalc(50){it + it}
}

fun main(){
//    callback()
    useInline()
}