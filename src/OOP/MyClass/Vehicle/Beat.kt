package OOP.MyClass.Vehicle

class Beat: Motorcycle {
    private var speed: Int = 0

    override fun started(): String {
        return "Beat Motorcycle has been started"
    }

    override fun forward(): String {
        this.speed += 5
        return "Beat motorcycle forwarded $speed km/h"
    }

    override fun stop(): String {
        return "Beat Motorcycle has been stopped"
    }
}