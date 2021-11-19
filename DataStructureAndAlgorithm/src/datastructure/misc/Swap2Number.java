package datastructure.misc;

/**
 * How to swap two numbers without using a third variable?
 * int a = 10;
 * int b = 20;
 * <p>
 * b = b + a; // now b is sum of both the numbers
 * a = b - a; // b - a = (b + a) - a = b (a is swapped)
 * b = b - a; // (b + a) - b = a (b is swapped)
 */
public class Swap2Number {

    public static void main(String[] args) {
        int a = 420;
        int b = 234;
        swapNumbers(a, b);
    }

    private static void swapNumbers(int a, int b) {
        b = b + a; // b = 10 + 20 = 30
        a = b - a; // a = 30 - 20 = 10;
        b = b - a; // b = 30 - 10 = 20;
        System.out.printf("a is %d, b is %d", a, b);
    }
}
