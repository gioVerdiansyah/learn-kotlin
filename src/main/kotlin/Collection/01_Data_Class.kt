package Collection

class Person(val name: String, var age: Int, val married: Boolean){

//    If class we need convert to string before
//    override fun toString(): String {
//        return "Person(name='$name', age=$age, married=$married)"
//    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (name != other.name) return false
        if (age != other.age) return false
        if (married != other.married) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

// Data Class no need convert, is automatically
data class DPerson(val name: String, var age: Int, val married: Boolean){
    fun intro(){
        println("Hello my name  $name, and my age is $age years old, and iam ${if (married) "has been married" else "not married yet"}.")
    }
}

fun useDataClass(){
    val cPerson = Person("Verdiansyah", 18, false)
    val dPerson = DPerson("Verdi", 21, true)

    println(cPerson) // Collection.Person@12edcd21
    println(dPerson) // DPerson(name=Verdi, age=21, married=true)

    val dPerson1 = DPerson("Verdi", 21, true)
    val dPerson2 = DPerson("Verdiansyah", 18, false)

    println(dPerson.equals(dPerson1)) // true
    println(dPerson.equals(dPerson2)) // false

//    If Class
    val cPerson1 = Person("Verdiansyah", 18, false)
    val cPerson2 = Person("Verdi", 21, true)

//    If we want to like data class, we need to convert first
    println(cPerson.equals(cPerson1)) // false
    println(cPerson.equals(cPerson2)) // false
}

fun useCopy(){
    val dUser1 = DPerson("Verdi", 18, false)
    val dUser2 = dUser1.copy()

    println(dUser2)

    val dUser3 = dUser2.copy(name = "Adi")
    println(dUser3)
}

fun useDestructuring(){
    fun basic(){
        val dPerson = DPerson("Verdi", 18, false)

        val name = dPerson.component1()
        val age = dPerson.component2()
        val married = dPerson.component3()

        println("Hello my name  $name, and my age is $age years old, and iam ${if (married) "has been married" else "not married yet"}.")
    }

    fun alternative(){
        val dPerson = DPerson("Verdi", 18, false)

        val (name, age, married) = dPerson

        println("Hello my name  $name, and my age is $age years old, and iam ${if (married) "has been married" else "not married yet"}.")
    }

    fun useFun(){
        val dPerson = DPerson("Verdi", 18, false)

        dPerson.intro()
    }

//    basic()
//    alternative()
    useFun()
}

fun main(){
//    useDataClass()
//    useCopy()
    useDestructuring()
}