package OOP.MyClass.Animal

class Cat (private var name:String) {
    fun mount(){
        println("My Cat \"$name\" says 'Meow''")
    }

    fun mount(eat: String){
        println("My Cat \"$name\" eating $eat")
    }

    fun mount(eat: String, many: Int){
        println("My Cat \"$name\" eating $eat ${many}x")
    }
}