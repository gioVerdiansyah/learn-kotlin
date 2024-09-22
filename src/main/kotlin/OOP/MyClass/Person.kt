package OOP.MyClass

open class Person(
    private var firstName: String,
    private var lastName: String,
    private var age: Int,
    private var married: Boolean
) {
    open fun introduction(): String {
        return """
            Hello my name is ${this.firstName} ${this.lastName}.
            My Age is ${this.age} years old.
            Iam also ${if (this.married) "not yet married" else "has been married"}
        """.trimIndent()
    }

    open fun greeting(){
        println("Hello User. How Are you?")
    }
}