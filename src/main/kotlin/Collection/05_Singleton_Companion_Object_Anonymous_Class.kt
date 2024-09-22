package Collection

//Singleton
object Bank{
    fun borrowMoney(much: Int){
        println("You borrowed money $$much.")
    }
}

fun useSingleton(){
    Bank.borrowMoney(100)
//     You don't need to instance
}

// Cannot because Singleton isn't allowed double class
//class Bank{
//    fun test(){
//        println("Test")
//    }
//}


//Companion
class Rent{
    companion object {
        const val NAME = "Verdi PC Rent XD"
        fun computer(money: Int) {
            println("You rent computer $$money. You can rent during $money hour.")
        }
    }
}

fun useCompanion(){
    println(Rent.NAME)
    Rent.Companion.computer(5)
    Rent.computer(10)
}

// Anonymous Class
interface ICar{
    fun started()
}

fun startingCar(car: ICar){
    car.started()
}

fun useAnonymousClass(){
    startingCar(object: ICar{
        override fun started() {
            println("Car has being started.")
        }
    })
}

// Function Single Abstract Method(SAM) Interface
fun interface IFly{
    fun fly()
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}

fun useSAM(){
//    SAM function can be used because IFly just have 1 member function
    flyWithWings{
        println("the bird flying.")
    }
}

fun main(){
//    useSingleton()
//    useCompanion()
//    useAnonymousClass()
    useSAM()
}