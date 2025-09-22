package com.kotlin_learning

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main program starts: ${Thread.currentThread().name}")

    // -------- Synchronous example --------
    println("Synchronous block starts")
    val syncResult1 = doTask1()
    val syncResult2 = doTask2()
    println("Synchronous results: $syncResult1 and $syncResult2")
    println("Synchronous block ends")

    // -------- Asynchronous example with coroutines --------
    val job1 = launch {
        delay(1000L)
        println("Coroutine 1: Completed on ${Thread.currentThread().name}")
    }

    val job2 = async {
        delay(1500L)
        "Coroutine 2 result"
    }

    println("Main program continues...")

    // wait for jobs
    job1.join()
    println("Result from coroutine 2: ${job2.await()}")

    println("Main program ends: ${Thread.currentThread().name}")
}

// -------- Helper synchronous functions --------
fun doTask1(): String {
    Thread.sleep(1000L) // blocking call
    return "Sync Task 1 done"
}

fun doTask2(): String {
    Thread.sleep(1500L) // blocking call
    return "Sync Task 2 done"
}
