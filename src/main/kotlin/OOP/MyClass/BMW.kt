package OOP.MyClass

class BMW() {
    val merk: String = "BMW"
    var color: String = "Red"
    var speed: Int = 0

    fun changeSpeed(speed: Int) {
        this.speed = speed
    }

//    FYI:
//    Don't use setter getter method name like this
//    setSpeed(), getSpeed()

    fun info(){
        println("Merk: $merk")
        println("Color: $color")
        println("Speed : $speed")
    }
}