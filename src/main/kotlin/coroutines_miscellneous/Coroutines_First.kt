package com.kotlin_learning.coroutines_basics

import kotlinx.coroutines.*

fun main() {
    // GlobalScope is not recommended for production (explained later)
    GlobalScope.launch {
        delay(1000L) // non-blocking delay
        println("Coroutines!")
    }
    println("Coroutines,")
    Thread.sleep(2000L) // block main thread to keep JVM alive
}