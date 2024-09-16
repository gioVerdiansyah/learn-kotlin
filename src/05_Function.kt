fun sayHello(){
    println("Hello Kotlin")
}

fun sayTo(name: String){
    println("Hello $name")
}

fun introduction(name: String = "Bot") : String {
    return "Hello Iam $name. \nNice to meet you"
}

fun sum(vararg params: Int): Int{
    var total: Int = 0
    for (i in params){
        total += i
    }

    return total
}

fun main(){
    sayHello()
    sayTo("Adi")
    println(introduction("Verdi"))

    val myNum: IntArray = intArrayOf(11,12,13,14,15)
    println(sum(1,2,3,4,5,6,7,8,9,10, *myNum))
//    *myNum is a rest
}