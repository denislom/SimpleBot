fun main() {
    // put your code here
    val str = readln().split(" ")
    val firstName: String = str[0]
    val lastName: String = str[1]
    val age: String = str[2]
    println("${firstName.first()}. $lastName, $age years old")
}