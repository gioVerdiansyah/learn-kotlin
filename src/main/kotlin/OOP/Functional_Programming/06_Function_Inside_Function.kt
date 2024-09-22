package OOP.Functional_Programming

fun sayWord(text:String){
//    printWord() // Unresolved reference: printWord

    fun printWord(){
        println(text)
    }

    printWord()
}

fun main(){
    sayWord("Hello")
}
