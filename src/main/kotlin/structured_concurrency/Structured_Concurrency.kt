package structured_concurrency

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

// CoroutineScope - Proper Coroutine Management

class UserRepository {
    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())

    fun fetchUserData() = scope.launch {
        // API call or database operation
        val user = withContext(Dispatchers.IO) {
            // Simulate network call
            delay(1000L)
            "User Data"
        }
        println(user)
    }

    fun cancelAll() {
        scope.cancel()
    }
}



// main function to test the UserRepository
suspend fun main() {
    val userRepository = UserRepository()
    userRepository.fetchUserData()
    delay(500L)
    userRepository.cancelAll()
}