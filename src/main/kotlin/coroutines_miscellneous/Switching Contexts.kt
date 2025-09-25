package com.kotlin_learning.coroutines_basics

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch(Dispatchers.Default) {
        println("Started in Default: ${Thread.currentThread().name}")

        withContext(Dispatchers.IO) {
            println("Working in IO: ${Thread.currentThread().name}")
            delay(1000L)
        }

        println("Back to Default: ${Thread.currentThread().name}")
    }
    
    // Add a delay to ensure all coroutines complete
    delay(1500)
}