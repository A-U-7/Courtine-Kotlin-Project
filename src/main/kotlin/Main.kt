package com.kotlin_learning

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main program starts: ${Thread.currentThread().name}")

    // launch coroutine 1
    val job1 = launch {
        delay(1000L)
        println("Coroutine 1: Completed on ${Thread.currentThread().name}")
    }

    // launch coroutine 2
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
