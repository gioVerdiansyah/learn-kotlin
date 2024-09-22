package OOP.Functional_Programming

typealias Arithmetic = (Int, Int) -> Int

fun main(){
    //    Lambda function
    val multi: Arithmetic = {valA, valB -> valA * valB}
    val sum: Arithmetic = {valA, valB -> valA + valB}

    println(multi(10, 30))
    println(sum(5, 50))

//    Lambda in foreach
    val nums: IntProgression = 1..100 step 5
    nums.forEach{v ->
        println("Value $v")
    }

    nums.forEachIndexed { index, _ ->
        println("Index $index")
    }

//    Use _ for unused variable
}