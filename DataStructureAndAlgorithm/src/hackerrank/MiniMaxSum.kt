package hackerrank
/*
Given five positive integers, find the minimum and maximum
values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of
two space-separated long integers.

arr = [1,3,5,7,9]

o/p = 16 24

Sample Input

1 2 3 4 5
Sample Output

10 14


 */
fun main() {
    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    miniMaxSum(arr)
}

fun miniMaxSum(arr: Array<Int>) {
    // sort the array
    var max: Long = 0
    var min : Long = 0
    arr.sort()
    var i = 0
    var j = 1

    while (i in 0..3){
        min +=arr[i]
        i++
    }
    while (j in 1..4){
        max += arr[j]
        j++
    }
    print("$min $max")

}

