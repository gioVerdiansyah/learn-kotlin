import com.sun.jdi.InterfaceType
import kotlin.collections.List

interface IStudent {
    fun getStudentName(): String
    fun getGrade(): String
    fun getAvgScore(): Double
    fun introduction(): String
}

class Student : IStudent {
    val name: String = "Verdiansyah"
    val classes: String = "XI RPL 2"
    private val scores: List<Int> = listOf(89, 88, 87, 81, 82, 89, 90, 91, 80, 87)

    override fun getStudentName(): String {
        return name
    }

    override fun getGrade(): String {
        val avg = scores.sum() / scores.size
        return when {
            avg >= 90 -> "A"
            avg >= 80 -> "B"
            avg >= 60 -> "C"
            avg >= 40 -> "D"
            else -> "E"
        }
    }

    override fun getAvgScore(): Double {
        return scores.average()
    }

    override fun introduction(): String {
        return """
            Hello my name is $name. Iam in class $classes with grade ${getGrade()}
        """.trimIndent()
    }
}

class StudentService(private val student: IStudent) {

    fun getAll(): Map<String, Any> {
        return mapOf(
            "name" to student.getStudentName(),
            "grade" to student.getGrade(),
            "avg_score" to student.getAvgScore(),
            "intro" to student.introduction()
        )
    }
}

fun main() {
    val student = Student()
    val studentService = StudentService(student)

    val allData = studentService.getAll()

    println("Name: ${allData["name"]}")
    println("Grade: ${allData["grade"]}")
    println("Avg Score: ${allData["avg_score"]}")
    println(allData["intro"])
}