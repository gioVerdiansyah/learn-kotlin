fun main() {
    val myMap: Map<String, String> = mapOf(
        "name" to "Verdi",
        "major" to "Software Engineer",
        "class" to "XI RPL 2"
    )

    for ((k, v) in myMap) {
        println("$k: $v")
    }

    println()

    val myData: Map<String, Any> = mutableMapOf(
        "success" to true,
        "message" to "Successfully get data",
        "code" to 200,
    )

    for ((k, v) in myData) {
        println("$k: $v")
    }
}