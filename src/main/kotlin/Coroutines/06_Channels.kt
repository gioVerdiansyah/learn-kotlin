package Coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking(CoroutineName("main")) {
    val myChannel = Channel<Int>()
    launch(CoroutineName("v1coroutine")) {
        withContext(Dispatchers.Default) { // for trigger switch thread
            println("Sending threading from ${Thread.currentThread().name}")
            for (i in 1..5) myChannel.send(i + 1)
        }
    }

    repeat(5) { println(myChannel.receive()) }
    println("Receive in ${Thread.currentThread().name}")
}