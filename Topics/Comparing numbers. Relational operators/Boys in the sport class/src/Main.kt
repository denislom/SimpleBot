fun main() {
    // put your code here
    val h1 = readln().toInt()
    val h2 = readln().toInt()
    val h3 = readln().toInt()
    val arranged = (((h1 >= h2) && (h2 >= h3)) || ((h3 >= h2) && (h2 >= h1)))
    println(arranged)
}