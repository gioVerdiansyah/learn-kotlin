import kotlin.reflect.typeOf

fun ifElse(){
    val stock: Boolean = false
    if(stock){
        println("Stock Already. Processing...")
    }else{
        println("Out of Stock!")
    }

    val stockIs: String = if (stock) "Already" else "exhausted"
    println("Stock is $stockIs")
}

fun logicOperant(){
    val A: Short = 20
    val B: Long = 150

    println((A > 10) && (B >= 80))
    println((A <= 10) || (B >= 50))
    println(!(A < B))
}

fun main(){
//    ifElse()
    logicOperant()
}