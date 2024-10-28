fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // do not change this line
    // enter your code
//    val seconds = totalSeconds % 60
//    val minutes = (totalSeconds / 60) % 60
//    val hours = totalSeconds / 3600
//    println("$hours:$minutes:$seconds")
    val timeSecondsToday = totalSeconds % (24*60*60)
    val seconds = timeSecondsToday % 60
    val hours = timeSecondsToday / 3600
    val minutes = ( timeSecondsToday - ( hours * 3600 ) - seconds ) / 60
    println( "$hours:$minutes:$seconds" )

}