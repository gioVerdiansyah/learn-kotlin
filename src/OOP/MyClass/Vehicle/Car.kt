package OOP.MyClass.Vehicle

abstract class Car {
    abstract fun started()
    abstract fun stopped()
    abstract val brand: String

    fun getCarInfo(){
        val model = "Corolla"
        val year = 2023
        val color = "Blue"
        val speed = 120

        println("Car Information:")
        println("Brand: $brand")
        println("Model: $model")
        println("Year: $year")
        println("Color: $color")
        println("Speed: $speed km/h")
    }
}