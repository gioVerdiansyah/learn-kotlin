package OOP.Functional_Programming

fun factorial1(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        var r: Int = 1
        for (i in 1..n) {
            r *= i
        }
        r
    }
}

// Recursion
fun factorial2(n: Int): Int {
    return if (n == 1){
        n
    }else{
        n * factorial2(n - 1)
    }
}

fun factorial3(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial3(n - 1, newResult)
    }
}

tailrec fun factorial4(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if(n == 1){
        newResult
    }else{
        factorial4(n - 1, newResult)
    }
}

// When a function is marked with the tailrec modifier, it should only be called for the last
// run and should not be used from within the try-catch-finally block.

fun main() {
//    println(factorial1(10))
//    println(factorial2(9999)) // 0
//    println(factorial3(9999)) // 0
    println(factorial4(32)) // 0
//    greater than 33 will overflow and return 0 use Long or BigInteger type
}