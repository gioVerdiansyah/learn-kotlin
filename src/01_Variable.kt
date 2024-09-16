fun basicVar(){
    var name: String = "Adi"
    println(name)

    name = "Verdi"
    print(name)
}

fun constanta(){
    val name: String = "Adi"
    println(name)

//    name = "Verdi" // error
    print(name)
}

fun char(){
    var myChar: Char = 'A'
    var myCharNum: Char = '1'

    println(myChar++)
    println(myChar++)
    println(myChar++)
    println(myChar--)
    println(myChar--)
    println(myChar--)

    println(myCharNum++)
    println(myCharNum++)
    println(myCharNum++)
    println(myCharNum--)
    println(myCharNum--)
    println(myCharNum--)
}

fun str(){
    val word: String = "Hello Kotlin"

    println(word[1]) //e

    for (char in word){
        print("$char ")
    }
    println()

    val words = "Hello \n" +
                "My name\n" +
                "Is Verdi\n"
    println(words)

    val line = """
        Iam from East Java
        Nice to meet you
    """.trimIndent()

    println(line)
}

fun number(){
//    Byte(8 bit)
    val byteNum: Byte = 0x0A

//    Short(16 Bit)
    val shortNum: Short = 5

//    Int(32 Bit)
    val intNum: Int = 505

//    Float(32 Bit)
    val floatNum: Float = 0.12345679f

//    Long(64 Bit)
    var longNum: Long = 1000
    longNum = 1000L

//    Double(64 Bit)
    val doubleNum: Double = 1.34

    println(byteNum)
    println(shortNum)
    println(intNum)
    println(floatNum)
    println(longNum)
    println(doubleNum)


    var minNum: Int = Int.MIN_VALUE
    var maxNum: Int = Int.MAX_VALUE

    println(minNum)
    println(maxNum)

    minNum += -1
    maxNum += 1

    println(minNum)
    println(maxNum)
}

fun calc(){
    var num1: Int = 11
    var num2 = 5

    println(num1 + num2)
    println(num1 - num2)
    println(num1 * num2)
    println(num1 / num2)
    println(num1 % num2)

    num1 += 4
    println(num1)

    num2 -= 2
    println(num2)

    num2 *= 2
    println(num2)

    num1 /= 2
    println(num1)

    num1 %= 3
    println(num1)

    num1++
    println(num1)

    num1--
    println(num1)
}

fun main(){
//    basicVar()
//    constanta()
//    char()
//    str()
    number()
//    calc()
}