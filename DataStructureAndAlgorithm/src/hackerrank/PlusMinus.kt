package hackerrank

/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

 e.g arr = [1,1,0,-1,-1]
 There are n = 5 elements, two positive, two negative and one zero.
 Their ratios are 2/5 = 0.400000, 2/5 = 0.400000, 1/5 = 0.200000,
 Results are printed as:

0.400000
0.400000
0.200000

Sample Input

STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
Sample Output

0.500000
0.333333
0.166667
Explanation

There are 3 positive numbers, 2 negative numbers, and 1 zero in the array.
The proportions of occurrence are positive:
3/6 = 0.500000
2/6 = 0.333333
1/6 = 0.166667
 */

fun main(){
    val n = readLine()!!.trim().toInt()
    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    plusMinus(arr)
}

fun plusMinus(arr:Array<Int>):Unit{
    var p=0
    var n=0
    var z=0
    val size = arr.size
    arr.forEach {
        when{
            it > 0 -> p++
            it < 0 -> n++
            it ==0 -> z++
        }
    }
    val ratios = arrayOf(p/size.toFloat(), n/size.toFloat(), z/size.toFloat())

    ratios.forEach {
        println("%.6f".format(it))
    }


}