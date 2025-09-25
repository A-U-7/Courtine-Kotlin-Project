package com.kotlin_learning.ust_coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import java.io.File

fun main() = runBlocking {
    val filepath = "batman.txt"
    val writeJob = async(Dispatchers.IO)
    {
       println("Writing to file")
        File(filepath).writeText("learning coroutines: IO Package !")
    }
    println("File writing completed")
    writeJob.await()

// reading from file
    val readJob = async(Dispatchers.IO)
    {
        println("Reading from file")
        val content = File(filepath).readText()
        println("File content: $content")
    }
    readJob.await()
    println("File reading completed")
}