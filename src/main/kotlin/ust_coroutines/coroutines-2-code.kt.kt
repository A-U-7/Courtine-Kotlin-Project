package ust_coroutines

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()=runBlocking {
    // Unbuffered Channel
    val channel = Channel<Int>()  // if we provide capacity then it will be buffered channel
    val prod=launch {
        for (x in 1..5) {
            println("Producer $x")
            channel.send(x) // partial execution
            println("Producer innovation copy golang")
            delay(500L)
            println("Producer end $x")
        }
        channel.close()
    }
    val cons=launch {
        for (x in channel) {
            println("Consumer $x")
            delay(500L)
            println("Consumer end $x")
        }
    }
    println("main waiting")
    prod.join()
    cons.join()
    println("Process completed")





    // Buffered Channel

    // Conflated Channel

    // Broadcast Channel

    // Shared Channel

}