package coroutines_miscellneous

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// launch - Fire and Forget

fun main() = runBlocking {
    val job = launch {
        delay(1000L)
        println("Coroutine completed")
    }
    println("Main continues")
    job.join() // wait for coroutine to complete
    println("Done")
}