package com.kotlin_learning.ust_coroutines

import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    // flow : it is a stream of data
    // it is a sequence of data

    println("launching flow")
    val codeFlow = flow {
        println("flow started")
        emit("A")
        emit("B")
        emit("C")
    }
    println("rain started 1")
    codeFlow.collect { println("Collector 1:$it") }

    println("rain started 2")
    codeFlow.collect { println("Collector 2:$it") }

    println("flow ended")



}