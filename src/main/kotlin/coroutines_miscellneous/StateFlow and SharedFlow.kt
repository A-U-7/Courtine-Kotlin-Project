package com.kotlin_learning.coroutines_miscellneous

import coroutines_miscellneous.simpleFlow
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun simpleFlow1(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(1000L)
        emit(i) // emit value
    }
}

fun main() = runBlocking {
    simpleFlow()
        .map { it * 4 } // transform
        .filter { it > 4 } // filter
        .collect { value -> // collect
            println(value)
        }
}