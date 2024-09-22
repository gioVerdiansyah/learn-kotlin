package OOP

import OOP.MyClass.Mustang

fun main(){
    val myCar = Mustang("Mustang-422", "Black")
    println(myCar.merk)

    myCar.refueling(100)
    myCar.showFuelTank()

    for (n in 1..100 step 5){
        Thread.sleep(1000   )
        myCar.changeSpeed(n)
        println(myCar.speed)
    }
}