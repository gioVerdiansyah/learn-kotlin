package Architecture.Clean.Basic

import Architecture.Clean.Basic.Entity.Student
import Architecture.Clean.Basic.Service.StudentService

fun main() {
    val student: Student = Student("Verdiansyah", "XI RPL 2", listOf(90, 88, 89, 91, 87, 85, 81, 81, 85, 90))
    val studentService: StudentService = StudentService(student)

    println("Name       : ${studentService.getName()}")
    println("Class      : ${studentService.classes}")
    println("Avg Score  : ${studentService.getAvgScore()}")
    println("Grade      : ${studentService.getGrade()}")
    println(studentService.introduction())
}