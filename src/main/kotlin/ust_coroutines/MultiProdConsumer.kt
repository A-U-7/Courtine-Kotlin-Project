import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main(): kotlin.Unit = runBlocking {
    val channel = Channel<Int>()

    // Producer 1
    launch {
        repeat(5) {
            println(" Producer 1 ")
            channel.send(it) // stop partial execution here
            println(" Producer 1 sent: $it ")
            delay(200)
        }
    }

    // Producer 2
    launch {
        repeat(5) {
            println(" Producer 2 ")
            channel.send(it + 100)
            println("Producer 2 sent: ${it + 100}")
            delay(300)
            println(" Producer 2 end ")
        }
    }

    // Consumer
    launch {
        println("Consumer")
        for (x in channel) { // receive
            println(" Consumer received: $x ")
        }
    }

    delay(2000)   // wait long enough for producers
    channel.close()
}
