package datastructure.misc;

// find factorial of an integer
// f(n) = f(1)*f(2).....f(n-1)*f(n)
public class Factorial {

    public static long factorial(long n){
        if (n == 1)return n;
        else
            return n * factorial(n-1);
    }

    public static void main(String[] args) {
        long num = 4;
        long res = factorial(num);
        System.out.println(res);

    }
}
