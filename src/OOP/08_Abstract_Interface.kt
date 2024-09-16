package OOP

import OOP.MyClass.Vehicle.Lamborgini

fun useAbstract(){
    val car = Lamborgini()
    println("My car name is ${car.brand}")
    car.started()
    car.stopped()
    car.getCarInfo()
}

fun main(){
    useAbstract()
}