package OOP

import OOP.MyClass.Animal.Animal1
import OOP.MyClass.Animal.Animal2
import OOP.MyClass.Animal.Animal3

fun main(){
    val animal1 = Animal1()
    animal1.name = "Cat"
    println("Animal1 name = ${animal1.name}")

    val animal2 = Animal2()
    animal2.name = "Dog"
    println("Animal2 name = ${animal2.name}")

    val animal3 = Animal3()
    animal3.name = "Cow"
    println("Animal3 name = ${animal3.name}")
}