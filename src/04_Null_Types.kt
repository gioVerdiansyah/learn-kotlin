// NPE (Null Pointer Exception) / The Billion Mistake

fun main(){
//    val text: String = null // Error
    val text: String? = null

    if(text is String){
        println("Text length: ${text.length}")
    }else{
        println("Zero")
    }

//    Or

    println(text?.length ?: "Zero") // Null check and if null print "Zero"
}