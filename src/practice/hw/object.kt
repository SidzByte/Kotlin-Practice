package practice.hw

//object Logger {
//    fun log(message: String) {
//        println("Log: $message")
//    }
//}
//
//fun main() {
//    Logger.log("Application Started")  // ✅ Only one instance
//}

object DatabaseManager {
    private var isConnected = false

    fun connect() {
        if (!isConnected) {
            println("🔗 Connecting to the database...")
            isConnected = true
        } else {
            println("✅ Already connected to the database.")
        }
    }

    fun disconnect() {
        if (isConnected) {
            println("❌ Disconnecting from the database...")
            isConnected = false
        } else {
            println("⚠️ No active connection to disconnect.")
        }
    }
}

fun main() {
    DatabaseManager.connect()  // 🔗 Connecting to the database...
    DatabaseManager.connect()  // ✅ Already connected to the database.
    DatabaseManager.disconnect()  // ❌ Disconnecting from the database...
    DatabaseManager.disconnect()  // ⚠️ No active connection to disconnect.
}
