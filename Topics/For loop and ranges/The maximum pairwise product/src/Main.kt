fun main() {
    // Read the number of elements
    val n = readln().toInt()

    // Handle the case of a single input element
    if (n == 1) {
        println(readln().toInt())
    } else {
        var num1 = Int.MIN_VALUE
        var num2 = Int.MIN_VALUE

        // Iterate over the input numbers
        for (i in 1..n) {
            val number = readln().toInt()

            // Update num1 and num2 with the two largest numbers
            if (number > num1) {
                num2 = num1
                num1 = number
            } else if (number > num2) {
                num2 = number
            }
        }

        // Output the maximum pairwise product
        println(num1 * num2)
    }
}
