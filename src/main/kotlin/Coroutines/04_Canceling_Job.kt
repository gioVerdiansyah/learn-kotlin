package Coroutines

import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.CancellationException

@OptIn(InternalCoroutinesApi::class)
fun main() = runBlocking {
    val job = launch {
        delay(10000L)
        print("New job started!")
    }

    delay(5000L)
    job.cancel(cause = CancellationException("Timeout after 2 second"))

    if (job.isCancelled) {
        println("Job canceled cause \"${job.getCancellationException().message}\"")
    }
}