// Array Types
//intArrayOf() : IntArray
//booleanArrayOf() : BooleanArray
//charArrayOf() : CharArray
//longArrayOf() : LongArray
//shortArrayOf() : ShortArray
//byteArrayOf() : ByteArray

fun main() {
    val intArr: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val mixArr = arrayOf(1, 2.5, "3", "Hello")

    println(intArr)
    println(mixArr.contentToString())
    println(mixArr.last())
}