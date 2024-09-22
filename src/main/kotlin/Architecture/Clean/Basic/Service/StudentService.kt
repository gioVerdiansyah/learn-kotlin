package Architecture.Clean.Basic.Service

import Architecture.Clean.Basic.Domain.IStudentService
import Architecture.Clean.Basic.Entity.Student

class StudentService(private val student: Student) : IStudentService {
    val classes: String = student.classes

    override fun getAvgScore(): Double {
        return student.scores.average()
    }

    override fun getName(): String {
        return student.name
    }

    override fun getGrade(): String {
        val avgScore = getAvgScore()
        if (avgScore.isNaN()) {
            return "N/A"
        }

        return when {
            avgScore >= 90 -> "A"
            avgScore >= 80 -> "B"
            avgScore >= 60 -> "C"
            avgScore >= 40 -> "D"
            else -> "E"
        }
    }

    fun introduction(): String{
        return """
            Hello my name is ${getName()}. Iam from class $classes with grade ${getGrade()}
        """.trimIndent()
    }
}