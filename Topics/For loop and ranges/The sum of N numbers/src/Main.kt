fun main() {
    // write your code here
    val n = readln().toInt()
    var result = 0
    for (i in 1..n) {
        val num = readln().toInt()
        result += num
    }
    println(result)
}