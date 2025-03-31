package practice.inline

inline fun processListFast(numbers: List<Int>, action: (Int) -> Unit) {
    for (num in numbers) {
        action(num)  // No extra function calls, better performance
    }
}

fun main() {
    val list = listOf(1, 2, 3, 4)
    processListFast(list) { println("Processing: $it") }
}
