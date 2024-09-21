package Collection

enum class Color (val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Level (val value: String){
    EASY("Easy"){
      override fun printValue(){
          println("Your are in EASY level, code is $value")
      }
    },
    MEDIUM("Medium"){
        override fun printValue(){
            println("Your are in MEDIUM level, code is $value")
        }
    },
    HARD("Hard"){
        override fun printValue(){
            println("Your are in HARD level, code is $value")
        }
    };

    abstract fun printValue()
}

enum class Order(val statusCode: Int, val description: String){
    PENDING(1, "Order is pending"),
    PROCESSING(2, "Order is being processed"),
    SHIPPED(3, "Order has been shipped"),
    DELIVERED(4, "Order has been delivered"),
    CANCELED(5, "Order has been canceled");

    fun getCurrentOrder(): String{
        return "Order: $name \nStatus: $statusCode \nDescription: $description"
    }

    fun isFinal(): Boolean{
        return this === DELIVERED || this === CANCELED
    }
}

fun useEnum (){
    val red = Color.RED
    println(red)
    println(red.value)

    val colors: Array<Color> = Color.values()
    colors.forEach { c ->
        println("$c : ${c.value}")
    }
}

fun useAbstractAndAnonymousClass(){
    val myVal = Level.valueOf("MEDIUM")
    println(myVal.value)

    myVal.printValue()
}

fun useEnumValue(){
    val level: Array<Level> = enumValues()
    level.forEach { c ->
        println("$c : ${c.value}")
    }

    val lvl: Level = enumValueOf("HARD")
    println(lvl.value)
}

fun ordering(){
    val myOrder = Order.PENDING

    println(myOrder.getCurrentOrder())

    if(myOrder.isFinal()){
        println("Your order has been completed!")
    }else{
        println("Your order is not yet completed!")
    }
}

fun main(){
//    useEnum()
//    useAbstractAndAnonymousClass()
//    useEnumValue()
    ordering()
}