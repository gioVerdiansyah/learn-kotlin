package Architecture.Clean.Basic.Domain

interface IStudentService {
    fun getName(): String
    fun getGrade(): String
    fun getAvgScore(): Double
}