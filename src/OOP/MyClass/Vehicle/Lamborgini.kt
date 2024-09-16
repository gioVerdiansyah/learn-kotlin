package OOP.MyClass.Vehicle

class Lamborgini: Car() {
    override val brand: String
        get() = "Lamborgini"

    override fun started() {
        println("$brand Started")
    }

    override fun stopped() {
        println("$brand Stopped")
    }
}