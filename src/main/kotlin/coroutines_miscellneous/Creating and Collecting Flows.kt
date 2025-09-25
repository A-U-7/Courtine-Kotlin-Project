package coroutines_miscellneous

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun simpleFlow(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(1000L)
        emit(i) // emit value
    }
}

fun main() = runBlocking {
    simpleFlow()
        .map { it * 2 } // transform
        .filter { it > 2 } // filter
        .collect { value -> // collect
            println(value)
        }
}
