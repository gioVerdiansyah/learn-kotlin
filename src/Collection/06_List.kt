package Collection// The different of array is
// Array can change value like this
// myArr[1] = 'A'
// But List is cannot

fun main(){
    val myNums: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10)
//    myNums[1] = 1 // Error
//    myNums.add(1) // Error
//    myNums.remove(1) // Error

//    But can
    val newNums = myNums.toMutableList()
    newNums.add(10, 11)

    println(myNums.toString())
    println(newNums.toString())
}