package OOP

import OOP.MyClass.Student

fun main(){
    val student = Student(
        firstName = "John",
        lastName = "Doe",
        age = 16,
        scores = listOf(85, 90, 78, 92, 88, 76, 95, 89, 91, 87),
        schoolName = "Springfield High School",
        hobby = "Basketball"
    )

    println(student.introduction())
    println("My Grade is        : ${student.calcGrade()}")
    println("My Hobby is        : ${student.hobby}")
    println("Is i get promoted? : ${if (student.isPromoted()) "Yes" else "No"}")
}