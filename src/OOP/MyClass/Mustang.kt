package OOP.MyClass

class Mustang {
    lateinit var merk: String
    lateinit var color: String
    lateinit var fuel: String
    var speed: Int = 0
        // Setter getter
        get() {
            println("Speed Getter function called!")
            return field
        }
        set(value) {
            println("Speed Setter function called!")
            field = value
        }

    constructor(merk: String, color: String) {
        if (merk.trim() != "" && color.trim() != "") {
            this.merk = merk
            this.color = color
        } else {
            println("Error: Invalid value constructors params!")
        }
    }

    fun refueling(value: Int) {
        this.fuel = "$value/100"
    }

    fun showFuelTank(){
        if(::fuel.isInitialized){
            println("Tank: ${this.fuel}")
        }else{
            println("Fuel not initialized!")
        }
    }

    fun changeSpeed(speed: Int) {
        this.speed = speed
    }
}