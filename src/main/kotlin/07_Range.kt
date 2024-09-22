fun useRange() {
    val oneToTen = 1..10
    println(oneToTen)

    println(oneToTen.first)
    println(oneToTen.step)

    println(oneToTen.last)
    println(oneToTen.endInclusive)
    println(oneToTen.endExclusive)
}

fun useRangeTo() {
    var oneToTen = 1.rangeTo(10)
    println(oneToTen)

    oneToTen.forEach {
        print("$it ")
//        'it' is default name parameter of lambda expression
    }

    println()
    oneToTen = 1.rangeUntil(10)
    println(oneToTen)

//    Custom
    print("\nmy nums: ")
    oneToTen.forEach { num ->
        print("$num ")
    }

    println()
    val myNums = 1..10 step 2
    myNums.forEach {
        print("$it ")
    }

    println()
    val reverseNum = 10.downTo(1)
    reverseNum.forEach {
        print("$it ")
    }
}

fun useRangeChar(){
    val myChars = 'a'..'z'
    myChars.forEach {
        print("$it ")
    }

    println("\nList grades:")
    val gradeList = 'A'.rangeTo('F')
    gradeList.forEach {
        print("$it ")
    }
}

fun main() {
//    useRange()
//    useRangeTo()
    useRangeChar()
}