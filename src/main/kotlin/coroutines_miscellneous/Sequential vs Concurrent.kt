package com.kotlin_learning.coroutines_basics

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

// Sample suspend functions
suspend fun fetchUserData1(): String {
    delay(1000) // Simulate network call
    return "User Data"
}

suspend fun fetchUserProfile1(): String {
    delay(1500) // Simulate another network call
    return "User Profile"
}

fun main() = runBlocking {
    // Sequential execution
    val timeSequential = measureTimeMillis {
        val data1 = fetchUserData1()
        val data2 = fetchUserProfile1()
        println("Sequential result: $data1, $data2")
    }
    println("Time taken sequentially: $timeSequential ms") // ~2500ms

    // Concurrent execution
    val timeConcurrent = measureTimeMillis {
        val data1 = async { fetchUserData1() }
        val data2 = async { fetchUserProfile1() }
        println("Concurrent result: ${data1.await()}, ${data2.await()}")
    }
    println("Time taken concurrently: $timeConcurrent ms") // ~1500ms
}