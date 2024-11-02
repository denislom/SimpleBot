fun main() {
    // write your code here
    val n = readln().toInt()
    var num1: Int = Int.MIN_VALUE
    var num2: Int = Int.MIN_VALUE
    if (n <= 1)
        println(n)
    else {
        for (i in 1..n) {
            val number = readln().toInt()
            if (i == 1)
                num1 = number
            else if (i == 2)
                num2 = number
            else if (number > num1 && number > num2 && num1 > num2)
                num2 = number
            else if (number > num1 && number > num2 && num1 < num2)
                num1 = number
            else if (number in num1 .. num2)
                num1 = number
            else if (number in num2 .. num1)
                num2 = number
        }
        println(num1 * num2)
    }
}