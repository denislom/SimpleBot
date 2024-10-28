fun main() {
    val invitation = readLine().toBoolean() // read other value in the same way
    // write your code here
    if (invitation) {
        val gift = readLine().toBoolean()
        if (gift) {
            println("true")
        }
        else {
            println("false")
        }
    }
    else {
        println("false")
    }
}