// write your code here
fun divide(a: Long, b: Long): Float {
    return (a.toFloat() / b.toFloat())
}
/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}