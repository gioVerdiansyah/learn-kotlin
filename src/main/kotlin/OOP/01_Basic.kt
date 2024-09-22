package OOP

import OOP.MyClass.BMW

fun main(){
    val myCar = BMW()
    println("Merk: ${myCar.merk}")
    println("Color: ${myCar.color}")
    println("Speed: ${myCar.speed}")

    myCar.changeSpeed(10)
    println("Speed: ${myCar.speed}")

    myCar.info()
}