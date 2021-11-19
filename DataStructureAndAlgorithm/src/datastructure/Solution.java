package datastructure;

import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Given two numbers, perform multiplication, subtraction, and
 * division operations on them, using ‘+’ arithmetic operator only.
 *
 * Subtraction :-  a - b = a + (-1)*b.
 * Multiplication :- a * b = a + a + a ... b times.
 * Division :- a / b =  continuously subtract b from a and
 * count how many times we can do that.
 */
public class Solution {

    public static int sub(int a, int b) {
        return a + (-1) * (b);
    }

    public static int mul(int a, int b) {
        int res = 0;
        for (int i = 0; i < b; i++) {
            res = a + res;
        }

        return res;
    }

    public static int div(int a, int b) {
        int res =0;
        while (a >= b){
            a = sub(a, b);
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Subtraction:: ");
        int res = sub(a, b);
        System.out.println(res);


        /*System.out.println("Multiplication:: ");
        int resMul = mul(a, b);
        System.out.println(resMul);

        System.out.println("Divide:: ");
        int resdiv = div(a, b);
        System.out.println(resdiv);*/


        scanner.close();
    }
}
