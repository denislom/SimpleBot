// write your code here
fun getLastDigit(digit: Int): Int {
    if (digit < 0)
        return (-digit % 10)
    else
        return (digit % 10)
}
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}