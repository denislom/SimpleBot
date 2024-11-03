import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var total = 0
    var purchase: Int
    var sufficientFunds = true

    while (scanner.hasNextInt()) {
        purchase = scanner.nextInt()
        if (purchase <= balance) {
            balance -= purchase
        } else {
            // Insufficient funds, exit loop and set flag
            sufficientFunds = false
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $purchase.")
            break
        }
    }

    // If all purchases were successful
    if (sufficientFunds) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}