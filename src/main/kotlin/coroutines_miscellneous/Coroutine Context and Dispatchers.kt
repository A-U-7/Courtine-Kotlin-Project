package com.kotlin_learning.coroutines_miscellneous

import kotlinx.coroutines.*

fun main() = runBlocking {
    // Different dispatchers
    launch { // inherits parent context (runBlocking)
        println("main runBlocking: ${Thread.currentThread().name}")
    }

    launch(Dispatchers.Unconfined) { // not confined - will work with main thread
        println("Unconfined: ${Thread.currentThread().name}")
    }

    launch(Dispatchers.Default) { // CPU-intensive work
        println("Default: ${Thread.currentThread().name}")
    }

    launch(Dispatchers.IO) { // I/O operations
        println("IO: ${Thread.currentThread().name}")
    }

    launch(newSingleThreadContext("MyThread")) { // new thread
        println("newSingleThreadContext: ${Thread.currentThread().name}")
    }
    
    // Small delay to ensure all coroutines complete
    delay(1000)
}