package Coroutines

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun firstJob() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(5000L)
        println("Start first job!")
    }

    job.start() // start a job without having to wait for it to finish
    println("End first Job!")
}

fun secondJob() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) { // create a job without running it immediately
        delay(5000L)
        println("Start second job!")
    }

    job.join() // will delay execution until the job is completed
    println("End second job!")
}

fun main() {
    firstJob()
    secondJob()

// End first Job!
// Start first job!
// Start second job!
// End second job!
}