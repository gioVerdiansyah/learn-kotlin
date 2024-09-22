package OOP.Functional_Programming

// Lambda Receiver
// apply
fun useReceiverThis(){
    val buildString: StringBuilder = StringBuilder().apply {
        append("Hello ")
        append("Kotlin ")
    }

    println(buildString)
}

// it
fun useReceiverIt(){
    val myText: String = "Hello Kotlin"
    myText.let {
        val msg: String = "$it. Kotlin is awesome!"
        println(msg)
    }


//    run as it and return body result or Unit
    val newText: String = myText.let {
        val msg: String = "$it. Kotlin is awesome!"
        println(msg)

        msg
    }

    println(newText)
}

// run
fun useReceiverRun(){
    val myText: String = "Hello"
    myText.run {
        val msg: String = "$this Kotlin"
        println(msg)
    }

//    similar with let but return object
    val newText = myText.run {
        val msg: String = "$this Kotlin"
        println(msg)

        msg
    }

    println(newText)
}

// with
fun useReceiverWith(){
    val myText: String = "Hello"
    with(myText) {
        println("$this Kotlin")
        println("$myText Kotlin")

        "$myText Kotlin"
    }

// Run as this object and return body result
    val newText: String = with(myText) {
        println("$this Kotlin")
        println("$myText Kotlin")

        "$myText Kotlin"
    }

    println(newText)
}

fun useReceiverAlso(){
    val myText: String = "Hello"
    myText.also {
        val msg: String = "$it Kotlin"
        println(msg)
    }

//    Run as it object and return origin object
    val newText: String = myText.also {
        val msg: String = "$it Kotlin"
        println(msg)
    }

    println(newText)
}

fun main(){
//    useReceiverThis()
//    useReceiverIt()
//    useReceiverRun()
//    useReceiverWith()
//    useReceiverAlso()

    val myText: String? = null
    myText?.let {
        val msg: String = it.reversed()
        println("Original: $it")
        println("Reverse: $msg")
    } ?: run {
        println("Message is null!")
    }
}

/*
 * Let:
 * Advantages:
 * - Allows using variables with scope limited to a certain block of code (block-scoping).
 * - Can be used to declare variables that will only be used inside the specific block.
 * Disadvantages:
 * - Variables declared with let can be reassigned, which may cause unintended changes in the program.
 *
 * Run:
 * Advantages:
 * - Executes a block of code and returns the result of the execution.
 * - Useful for executing code in an isolated scope.
 * Disadvantages:
 * - In some cases, using run may make the code harder to understand because the block is executed outside the main context.
 *
 * With:
 * Advantages:
 * - Simplifies code by providing direct access to an object's properties within the block.
 * - Useful to avoid repetitive writing of certain variables.
 * Disadvantages:
 * - Careless usage of with can cause ambiguity and errors, especially when variable names outside the with block are the same.
 *
 * Apply:
 * Advantages:
 * - Commonly used to invoke functions with arguments from a collection (usually an array or list).
 * - Useful for calling functions with a dynamic number of arguments.
 * Disadvantages:
 * - It may be hard to understand code that uses apply if the type and number of arguments are not clear.
 *
 * Also:
 * Advantages:
 * - Useful for performing multiple operations inside a block while returning the object itself.
 * - Improves code readability and understanding.
 * Disadvantages:
 * - Misunderstanding the use of also can lead to mistakes or make the code harder to read.
 */


// 'it' is the default parameter that refers to myText in the let block.
// 'this' refers to the myText object in the run block.
