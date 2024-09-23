package Coroutines

import kotlinx.coroutines.*

// CoroutineDispatcher
// is a base class in Kotlin that is used to organize and determine which thread will run the coroutine.

// Dispatchers.Default
// This is the basic dispatcher used by all standard builders such as launch, async, etc.
// It's a default
// launch {} or launch (Dispatchers.Default) {}

// Dispatchers.IO
// A dispatcher that can be used to unblock I/O operations. It will use a pool of threads created on request.
// launch (Dispatchers.IO) {}

// Dispatcher.Unconfined
// This dispatcher will execute coroutines on the running thread until it reaches the suspension point. After deferral,
// the coroutines will resume on the thread where the deferral computation was invoked.

// Example

fun useDispatchUnconfined() = runBlocking<Unit> {
    launch (Dispatchers.Unconfined) {
        println("Starting in thread:")
        println("Name   : ${Thread.currentThread().name}")
        println("ID     : ${Thread.currentThread().threadId()}")
        println("Group  : ${Thread.currentThread().threadGroup}")

        println()
        delay(2000L)

        println("End in thread:")
        println("Name   : ${Thread.currentThread().name}")
        println("ID     : ${Thread.currentThread().threadId()}")
        println("Group  : ${Thread.currentThread().threadGroup}")
    }.start()
}


// Single Thread Context
// This dispatcher guarantees that at any time the coroutine will be executed on the thread you specify.
@OptIn(ObsoleteCoroutinesApi::class)
fun useSingleThreadContext() = runBlocking<Unit> {
    val dispatcher = newSingleThreadContext("myDispatch")
    launch (dispatcher) {
        println("Starting in thread:")
        println("Name   : ${Thread.currentThread().name}")
        println("ID     : ${Thread.currentThread().threadId()}")

        println()
        delay(2000L)

        println("End in thread:")
        println("Name   : ${Thread.currentThread().name}")
        println("ID     : ${Thread.currentThread().threadId()}")
    }.start()
}


// Thread Pool
// is a dispatcher that owns a thread pool. It will start and resume the coroutine in one of the available threads in the pool.
// The runtime will determine which threads are available and also determine how the load distribution process works.

fun useThreadPool() = runBlocking {
    val dispatcher = newFixedThreadPoolContext(5, "myPool")
    launch (dispatcher) {
        println("Starting in thread:")
        println("Name   : ${Thread.currentThread().name}")
        println("ID     : ${Thread.currentThread().threadId()}")

        println()
        delay(2000L)

        println("End in thread:")
        println("Name   : ${Thread.currentThread().name}")
        println("ID     : ${Thread.currentThread().threadId()}")
    }.start()
}

fun main(){
//    useDispatchUnconfined()
//    useSingleThreadContext()
    useThreadPool()
}