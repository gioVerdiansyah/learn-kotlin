
// Variant
abstract class Vehicle(wheel: Int)
class Car(speed: Int): Vehicle(4)
class MotorCycle(speed: Int): Vehicle(2)

fun variance(){
    val car = Car(120)
    val motorcycle = MotorCycle(60)
    var vehicle: Vehicle = car
    vehicle = motorcycle
//    Because the same type we can assign them
//    We can also

    val carList = listOf(Car(200), Car(300))
    val vehicleList = carList
}


// Covariant
interface List<out C> : Collection<C>{
    operator fun get(index: Int): C
}
// If we type out that parameter jut can production and can't consume


// Contravariant
interface Comparable<in C>{
    operator fun compareTo(other: C): Int
}
// Reverse of Covariant, parameter jut can consume and can't to production

fun main(){

}