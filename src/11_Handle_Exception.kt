fun nullHandling(){
    val myNum: Int? = null
    val newNum: Int

    try{
        newNum = myNum!!

        print("My new num is: $newNum")
    }catch (e: Exception){
        println("Error get Num: ${e.message}")
    }
}

fun finallyErrorHandling(){
    val myVal: String = "13x"

    try{
        val myNum: Int = myVal.toInt()
        print(myNum + 10)
    }catch (e: Exception){
        println("Error get Num: ${e.message}")
    }finally {
        println("FINALLY HANDLING EXCEPTION")
    }
}

fun handleMultipleErrors() {
    val numbers = arrayOf(10, 0, 5)
    val index = "2x"

    try {
        val idx = index.toInt()
        val num = numbers[idx]
        val result = 100 / num

        println("Result: $result")
    } catch (e: NumberFormatException) {
        println("Error: Index is not a valid number (${e.message})")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Error: Index is out of array bounds (${e.message})")
    } catch (e: ArithmeticException) {
        println("Error: Division by zero is not allowed (${e.message})")
    } finally {
        println("Execution finished.")
    }
}

fun main (){
//    nullHandling()
//    finallyErrorHandling()
    handleMultipleErrors()
}