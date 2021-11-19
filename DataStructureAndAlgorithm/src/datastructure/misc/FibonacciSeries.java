package datastructure.misc;

public class FibonacciSeries {

    // Recursion
    public static int fibonacciSeriesRecur(int n) {
        if (n <= 1) return n;
        return fibonacciSeriesRecur(n - 1) + fibonacciSeriesRecur(n - 2);
    }
    // iterative
    public static void printFibonacciSeries(int n) {
        int n1 = 0, n2 = 1;
        int counter = 0;
        while (counter < n) {
            System.out.print(n1 + " ");
            //swap
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            counter++;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        // iterative
        System.out.println("Iterative:: ");
        printFibonacciSeries(10);

        System.out.println("Recursive:: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeriesRecur(i) + " ");
        }
    }
}
