package OOP.MyClass

class Student(
    private var firstName: String,
    private var lastName: String,
    private var age: Int,
    private var scores: List<Int>,
    private var schoolName: String,
    var hobby: String,
) : Person(firstName, lastName, age, false) {

    fun calcGrade(): String {
        return when (scores.sum() / scores.size / 10) {
            in 9..10 -> "A"
            8 -> "B"
            7 -> "C"
            6 -> "D"
            in 0..5 -> "F"
            else -> "Invalid score"
        }
    }

    fun isPromoted(): Boolean {
        return this.calcGrade() >= "A" && this.calcGrade() <= "B"
    }

    override fun introduction(): String {
        super.greeting()
        return """
            Hello, my name is ${this.firstName} ${this.lastName}.
            I am ${this.age} years old and currently a student at ${this.schoolName}.
            I am in grade ${this.calcGrade()}, and my hobby is ${this.hobby}.
        """.trimIndent()
    }
}