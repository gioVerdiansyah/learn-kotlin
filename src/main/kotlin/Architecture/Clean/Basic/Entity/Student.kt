package Architecture.Clean.Basic.Entity

import Architecture.Clean.Basic.Domain.IStudent

class Student(
    val name: String,
    val classes: String,
    val scores: List<Int>
) : IStudent
{
    override fun introduction(): String{
        return """
            Hello my name is $name. Iam from class $classes
        """.trimIndent()
    }
}