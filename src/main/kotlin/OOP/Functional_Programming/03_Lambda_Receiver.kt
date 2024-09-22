package OOP.Functional_Programming

// Without
fun withOutLambdaReceiver(): String {
    val buildStr: StringBuilder = StringBuilder()
    buildStr.append("Kotlin ")
    buildStr.append("is ")
    buildStr.append("Awesome ")
    return buildStr.toString()
}

fun buildStr(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

fun withLambdaReceiver(): String {
    return buildStr {
        append("Hello ")
        append("Kotlin ")
        append("You're ")
        append("the ")
        append("best ")
    }
}

fun main(){
    println(withOutLambdaReceiver())
    println(withLambdaReceiver())
}
