package hackerrank
/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 Constraints

All input times are valid
Sample Input

07:05:45PM
Sample Output

19:05:45

 */
fun main() {
    val s = readLine()!!
    val result = timeConversion(s)
    println(result)
}
//07:05:45PM
//19:05:45


fun timeConversion(s: String): String {

    val hour = s.substring(0, 2)
    val minute = s.substring(3, 5)
    val seconds = s.substring(6, 8)
    val meridian = s.substring(8)
    var convertedTime = ""
    if (meridian == "AM") {
        convertedTime = if (hour.toInt() == 12) {

            "0${hour.toInt() - 12}:$minute:$seconds"
        }else{
            "$hour:$minute:$seconds"
        }
    }
    if (meridian == "PM") {
        convertedTime = if (hour.toInt() < 12) {
            "${hour.toInt() + (12)}:$minute:$seconds"
        }else{
            "$hour:$minute:$seconds"
        }
    }
    return convertedTime
}
