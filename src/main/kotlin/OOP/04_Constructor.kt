package OOP

import OOP.MyClass.Fruit

fun main(){
    val mango = Fruit(20, "Yellow", "Sweet", "Mango", "India")
    println("Size: ${mango.size}, Color: ${mango.color}, Taste: ${mango.taste}, Type: ${mango.type}, Origin: ${mango.origin}")
}