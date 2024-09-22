package Collection

//Outer class
class House {
    val number: Int = 124

    //    Inner class
    class Room {
        fun info() {
            print("Hello this is room in house ")

//            Member class can't be access property/method from outer class
//            print(this.number) // Not Found
        }
    }

    //    Inner class
    inner class Fence() {
        fun getHouseNumber() {
//            Inner class can be access property / method
            print("House number is $number")
        }
    }
}

fun main() {
    val house = House()

    val room = House.Room()
    room.info()

    println()

    val fence = house.Fence()
    fence.getHouseNumber()
}