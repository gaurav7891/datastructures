package hackerrank

/*
You will be given a list of 32 bit unsigned integers.
Flip all the bits (1->0 and 0->1) and return the result as an unsigned integer.

Example
n = (9)10
(9)10 = (1001)2
We're working with 32 bits, so:
(00000000000000000000000000001001)2 = (9)10
(11111111111111111111111111110110)2 = (4294967286)10

returns 4294967286
int: the unsigned decimal integer result
The first line of the input contains q, the number of queries.
Each of the next  q lines contain an integer, n, to process.

Sample Input

3
2147483647
1
0
Sample Output

2147483648
4294967294
4294967295
Explanation

Take 1 for example, as unsigned 32-bits is 00000000000000000000000000000001 and
doing the flipping we get 11111111111111111111111111111110 which in turn is 4294967294.
 */
/*
 * Complete the 'flippingBits' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER n as parameter.
 */

// TODO COMPLETE THE SOLUTION
fun flippingBits(n: Long): Long {
    // Write your code here
    return 0
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val n = readLine()!!.trim().toLong()

        val result = flippingBits(n)

        println(result)
    }
}