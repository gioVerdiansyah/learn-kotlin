fun useWhile() {
    var i: Int = 0

    while (i <= 10) {
        println("Index ke-$i")

        i++
    }
}

fun useDoWhile() {
    var i: Int = 0

    do {
        println("Index ke-$i")

        i++
    } while (i <= 10)
}

fun useFor() {
    val myNums: IntProgression = 1..20 step 2

    for (num in myNums) {
        println(num)
    }

    val myArr: IntArray = intArrayOf(1, 2, 3, 4, 5)
    for (arr in myArr) {
        println(arr)
    }
}

fun useForWithIndex() {
    val myNums: IntProgression = 1..20 step 2
    val myArr: IntArray = intArrayOf(1, 2, 3, 4, 5)

    for ((index, value) in myNums.withIndex()) {
        println("Value $value from index $index")
    }

    println()

    for ((index, value) in myArr.withIndex()) {
        println("Value $value from index $index")
    }
}

fun useContinueBreak() {
    val data = arrayOf(1, 2, 3, null, 5, 6, null, 8, null, 10)

    for (v in data) {
        if (v == null) continue

        print("$v ")
    }

    println()
    for (v in data) {
        if (v == null) break

        print("$v ")
    }
}

fun useBreakContinueLabels() {
    val data = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))

    firstLoop@ for ((i, v) in data.withIndex()) {
        for (j in v) {
            if (i == 1) continue@firstLoop
            print("$j ")
            if (j == 8) break@firstLoop
        }
        println()
    }
}

fun main() {
//    useWhile()
//    useDoWhile()
//    useFor()
//    useForWithIndex()
//    useContinueBreak()
    useBreakContinueLabels()
}