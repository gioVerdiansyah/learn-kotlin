package Coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking { // blocking code
    launch { // starting coroutine without results
        delay(1000L)
        println("Coroutines")
    }
    println("Hello")
    delay(2000L)

    // async similar with launch but return with results
}