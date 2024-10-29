fun main() {
    // write your code here
    val number: Int = readln().toInt()
    when {
        number < 0 -> println("negative")
        number > 0 -> println("positive")
        number == 0 -> println("zero")
    }
}