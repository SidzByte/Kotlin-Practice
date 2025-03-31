import java.util.*

//data class Student(val name: String, val rollNo: Int)
//
//fun main() {
//    val s1 = Student("happy", 101)
//    val s2 = Student("happy", 101)
//
//    println(s1.hashCode())
//    println(s2.hashCode())
//}
    //1️⃣ HashMap Example – Key-Value Pairs
fun main() {
    val map = HashMap<String, Int>()

    map["Alice"] = 35
    map["Bob"] = 30
    map["Charlie"] = 6
    map["Alice"] = 45  // ✅ Overwrites previous value

    println(map)  // Output: {Alice=26, Bob=30, Charlie=28}
    println(map["Alice"]) // ✅ Output: 26
}

//2️⃣ HashSet Example – Unique Elements
//A HashSet stores only unique values and allows null.
//fun main() {
//    val set = HashSet<String>()
//
//    set.add("Apple")
//    set.add("Banana")
//    set.add("Apple")  // ❌ Duplicate, will not be added
//
//    println(set)  // Output: [Apple, Banana]
//}

//3️⃣ HashTable Example – Thread-Safe HashMap
//HashTable is like HashMap but doesn’t allow null keys/values and is thread-safe
//fun main() {
//    val table = Hashtable<String, Int>()
//
//    table["Alice"] = 25
//    table["Bob"] = 30
//    // table[null] = 40  // ❌ Error! Null keys/values not allowed
//
//    println(table)  // Output: {Alice=25, Bob=30}
//}
