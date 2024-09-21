package Collection

fun main() {
    val setA = setOf(1, 1, 2, 3, 4, 4)

    println(setA) // [1, 2, 3, 4]
//    Set will discard double value

    val setB = setOf(1, 2, 3, 4, 4, 4)
    println(setA == setB) // true
    println(2 in setB) // true

    val setC = setOf(1, 4, 7)
    println(setA.union(setC)) // [1, 2, 3, 4, 7]
    println(setA.intersect(setC)) // [1, 4]

    println(setB.subtract(setC)) // [2, 3]

    val numbers = setOf("one", "two", "three")
    val numbers2 = setOf("three", "four")

// merge differences
    println((numbers - numbers2) union (numbers2 - numbers))
// [one, two, four]
}

//Intersection
//Use intersect to create a new set with the same values from both sets.

//Union
//Use union to create a new set by taking all the data from both sets.

//Substracting
//Use substract to create a new set with values that are not in the specified set.

//Symmetric Difference
//Unlike the above case, there is no way to find the symmetric difference value in Kotlin. You need to manually find the values in all the sets, but the same values are not included in the new set.