package com.kotlin_learning.ust_coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main starts:${Thread.currentThread().name}")
    launch (Dispatchers.Default) {
        println("Coroutine 1 running on:${Thread.currentThread().name}")
        delay(500L)
        println("Coroutine 1 resumed on:${Thread.currentThread().name}")
    }
    val job = launch (Dispatchers.IO) {
        println("Coroutine 2 running on:${Thread.currentThread().name}")
        delay(500L)
        println("Coroutine 2 resumed on:${Thread.currentThread().name}")
    }
    
    // Wait for all children to complete
    job.join()
    println("Main ends:${Thread.currentThread().name}")
}