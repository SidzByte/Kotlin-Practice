package dailykotlinpractice

class variable{
    val a: Int = 10
    val b: Int = 20

    init {
        val c : Int = a + b
        println(c)
    }
}
fun main(){
    val x =  variable()
    println(x.a)

}