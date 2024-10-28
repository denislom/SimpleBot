fun main() {
    // Read the person's name and age from the console
    val name = readln()
    val age = readln().toInt()

    // Calculate the birth year
    val birthYear = 2023 - age

    // Print the greeting message using string templates
    println("Hello $name! You were born in the year $birthYear.")

}