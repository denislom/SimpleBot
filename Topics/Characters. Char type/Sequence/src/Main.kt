fun main() {
    // put your code here
    val char1: Char = readln().first()
    val char2: Char = readln().first()
    val char3: Char = readln().first()

    if (char2 == char1 + 1 && char3 == char2 + 1) {
        println("true")
    } else {
        println("false")
    }
}