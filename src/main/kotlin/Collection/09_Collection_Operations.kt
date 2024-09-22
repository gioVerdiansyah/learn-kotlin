package Collection

val nums: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

fun useFilter() {
    val evenNums: List<Int> = nums.filter { it % 2 == 0 }
    val oddNums: List<Int> = nums.filter { it % 2 == 1 }

    println("Original nums: $nums")
    println("Even nums: $evenNums")
    println("Odd nums: $oddNums")

    val ltFive: List<Int> = nums.filterNot { it > 5 }
    println(ltFive)
}

fun useMap() {
    val multi: List<Int> = nums.map { it * 2 }

    println(multi)
}

fun useCount() {
    val numCount: Int = nums.count()

    println("Nums total: $numCount")
    println(nums.count { it > 5 })
}

fun searching() {
    val oddNumFirst = nums.find { it % 2 == 1 }
    val ltZero = nums.firstOrNull { it < 0 }
    val mtEight = nums.lastOrNull { it > 8 }

    println(oddNumFirst)
    println(ltZero)
    println(mtEight)

//    first() and last() is same but if there is a null, Exception will show up
}

fun sorted() {
    val chars: List<Char> = listOf('k', 'o', 't', 'l', 'i', 'n')

    println(chars.sorted())
    println(chars.sortedDescending())
}

fun useFold() {
    val fold = nums.fold(5) { current, item ->
        println("Current: $current")
        println("Item: $item")
        println()

        current + item
    }

    println("Fold result: $fold")
    println()

    val reversedFold = nums.foldRight(5) { c, i ->
        println("Current: $c")
        println("Item: $i")
        println()

        c + i
    }

    println("Reversed fold result: $reversedFold")
}

fun useDrop() {
    val droppedValue: List<Int> = nums.drop(5)
    val droppedValueWhile: List<Int> = nums.dropWhile { it <= 7 }
    val droppedValueLast: List<Int> = nums.dropLast(5)
    val droppedValueLastWhile: List<Int> = nums.dropLastWhile { it >= 7 }

    println(droppedValue) // [6, 7, 8, 9, 10]
    println(droppedValueWhile) // [8, 9, 10]

    println(droppedValueLast) // [1, 2, 3, 4, 5]
    println(droppedValueLastWhile) // [1, 2, 3, 4, 5, 6]
}

fun useTake() {
    val takeValue: List<Int> = nums.take(5)
    val takeValueWhile: List<Int> = nums.takeWhile { it <= 4 }
    val takeValueLast: List<Int> = nums.takeLast(5)
    val takeValueLastWhile: List<Int> = nums.takeLastWhile{ it >= 8 }

    println(takeValue) // [1, 2, 3, 4, 5]
    println(takeValueWhile) // [1, 2, 3, 4]

    println(takeValueLast) // [6, 7, 8, 9, 10]
    println(takeValueLastWhile) // [8, 9, 10]
}

fun useRemove(){
    val myNums: MutableList<Int> = nums.toMutableList()
    myNums.removeIf { it % 2 == 0 }
    println(myNums)

    val myNums2: MutableList<Int> = nums.toMutableList()
    myNums2.removeAll(myNums.filter { it % 2 == 1 })
    println(myNums2)
}

fun useSlice(){
    val slicing: List<Int> = nums.slice(3..8 step 2) // start and end index
    println(slicing) // [4, 6, 8]

    val slice: List<Int> = nums.slice(slicing)
    println(slice)
}

data class Items(val key: Int, val value: String)

fun useDistinct(){
    val duplicatedNums: List<Int> = listOf(1,1,2,2,3,4,5,5)

    val uniqueNums: List<Int> = duplicatedNums.distinct()
    println(uniqueNums)

    val myItems: List<Items> = listOf(
        Items(1,"Laptop"),
        Items(1, "Mouse"),
        Items(2, "Keyboard"),
        Items(3, "Charger"),
        Items(3, "MousePad"),
        Items(4, "Earphone"),
        Items(4, "HandPhone")
    )

    val uniqueItems: List<Items> = myItems.distinctBy { it.key }
    uniqueItems.forEach { e ->
        println("Index ${e.key} with value ${e.value}")
    }

    val myAlpha: List<String> = listOf("A", "B", "CC", "DD", "EEE", "FFFF", "GGGGG")
    println(myAlpha.distinctBy { it.length }) // [A, CC, EEE, FFFF, GGGGG]
}

fun useChunked(){
    val words: String = "QWERTY"
    val chunked: List<String> = words.chunked(3)
    val chunkedWhile: List<String> = words.chunked(3){
        it.toString().toLowerCase()
    }

    println(chunked) // [QWE, RTY]
    println(chunkedWhile) // [qwe, rty]

    val myList: MutableList<Int> = nums.toMutableList()
    myList.addAll(myList.lastIndex, listOf(11,12))
    val numChunk: List<List<Int>> = myList.chunked(3)

    println(numChunk) // [[1, 2, 3], [4, 5, 6], [7, 8, 9], [11, 12, 10]]
    println(numChunk.flatten()) // [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 10]
}

fun useSequence(){
    val myNums: List<Int> = (1..1000).toList()
    val eagerEvaluate: Int = myNums.filter { it % 5 == 0 }.map { it * 5 }.first()
//    1..1000 -> 5,10,15.. -> 25,50,100.. -> first -> 25

    val lazyEvaluate: Int = myNums.asSequence().filter { it % 5 == 0 }.map { it * 5 }.first()
    //    1..5 -> 5 -> 25 -> first -> 25

    println(eagerEvaluate)
    println(lazyEvaluate)

//    Lazy loop with sequence
    val seqNums: Sequence<Int> = generateSequence(1){ it + 1}
    seqNums.take(5).forEach { print("$it ") }
}

fun main() {
//    useFilter()
//    useMap()
//    useCount()
//    searching()
//    sorted()
//    println(nums.sum())
//    useFold()
//    useDrop()
//    useTake()
//    useRemove()
//    useSlice()
//    useDistinct()
//    useChunked()
    useSequence()
}