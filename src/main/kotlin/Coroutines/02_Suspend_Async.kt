package Coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.measureTime

suspend fun getCapital(): Int{
    delay(3000L)
    return 80000
}

suspend fun getIncome(): Int{
    delay(5000L)
    return 125000
}

// Sequential
fun useSuspend() = runBlocking{
    val capital: Int = getCapital()
    val income: Int = getIncome()

    println("Your capital is $capital. Your income is $income")
    println("Profit is ${income - capital}")
}

// Asynchronous
fun useAsync() = runBlocking {
    val capital = async { getCapital() }
    val income = async { getIncome() }

    println("Your capital is ${capital.await()}. Your income is ${income.await()}")
    println("Profit is ${income.await() - capital.await()}")
}

fun main(){
    val useSuspendTime = measureTime { useSuspend() }
    val useAsyncTime = measureTime { useAsync() }

    println("Suspend Time: $useSuspendTime")
    println("Async Time: $useAsyncTime")
}