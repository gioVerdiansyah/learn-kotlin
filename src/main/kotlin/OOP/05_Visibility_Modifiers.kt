package OOP

import OOP.MyClass.GetKeyboard
import OOP.MyClass.MyBag

// Public       | Can be access in everywhere
// Private      | Just can be access on same scope
// Protected    | Only in child class or current class
// internal     | Just on current module / some library

fun main() {
    val myBag = MyBag()

//    Public
    println(myBag.laptop)

//    Private
//    println(myBag.mouse)
//    Kotlin: Cannot access 'val mouse: String': it is private in 'OOP/MyClass/MyBag')
    println(myBag.getMouse())

//    Protected
//    println(myBag.keyboard)
//    Kotlin: Cannot access 'val keyboard: String': it is protected in 'OOP/MyClass/MyBag'
    val keyboard = GetKeyboard()
    println(keyboard.getKeyBoard())


//    Internal
    println(myBag.phone) // yes is can because our project is in same module (IDE)
}