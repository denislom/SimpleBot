// Declare a function to determine age category based on the given age
fun minorOrAdult(age: Int) {
    if (age < 18)
        println("Minor")
    else if (age in 18 .. 64)
        println("Adult")
    else
        println("Senior")
}

fun main() {
    // Read the person's age
    val age = readLine()!!.toInt()

    // Call the function with the age as argument
    minorOrAdult(age)
    // Print the result
//    println()
}