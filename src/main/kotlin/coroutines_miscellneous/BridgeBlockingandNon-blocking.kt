package com.kotlin_learning.coroutines_miscellneous

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        delay(1000L)
        println("From launch")
    }
    println("Coroutines Launch")
}
