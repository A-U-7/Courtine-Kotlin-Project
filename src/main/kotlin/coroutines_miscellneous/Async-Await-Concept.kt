package coroutines_miscellneous

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

// async for Concurrent Operations

suspend fun fetchUserData(): String {
    delay(1000L)
    return "User Data"
}

suspend fun fetchUserProfile(): String {
    delay(1500L)
    return "User Profile"
}

fun main() = runBlocking {
    val time = measureTimeMillis {
        val userData = async { fetchUserData() }
        val userProfile = async { fetchUserProfile() }

        println("${userData.await()} and ${userProfile.await()}")
    }
    println("Completed in $time ms")
}