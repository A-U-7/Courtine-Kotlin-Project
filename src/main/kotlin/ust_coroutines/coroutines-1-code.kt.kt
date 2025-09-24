package ust_coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main program starts:${Thread.currentThread().name}")

   val job1= launch {
        println("launched job1:${Thread.currentThread().name}")
        delay(1000L) // Non-blocking delay (like sleep, but doesn't block thread)
        println("end of coroutine!")
    }
    val job2= launch {
        println("launched job2:${Thread.currentThread().name}")
    }
    job1.join()
    println("end of main")
}
