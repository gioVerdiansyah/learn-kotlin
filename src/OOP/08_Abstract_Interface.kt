package OOP

import OOP.MyClass.Vehicle.Beat
import OOP.MyClass.Vehicle.Lamborgini

fun useAbstract(){
    val car = Lamborgini()
    println("My car name is ${car.brand}")
    car.started()
    car.stopped()
    car.getCarInfo()
}

fun useInterface(){
    val beat = Beat()
    println(beat.started())
    println(beat.forward())
    println(beat.forward())
    println(beat.forward())
    println(beat.stop())
}

fun main(){
//    useAbstract()
    useInterface()
}

// Abstract Class:
// - Can contain default values.
// - Members are final by default. To allow overriding, use `abstract` (required) and `open` (optional).
// - A class can extend only one abstract class, indicated by `()`.
// - Used when some members' implementations are unknown.

// Interface:
// - Cannot contain default values.
// - Members are abstract by default and must be overridden.
// - A class can implement more than one interface.
// - Used when all members' implementations are unknown.